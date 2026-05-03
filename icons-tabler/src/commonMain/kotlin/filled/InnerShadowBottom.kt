package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowBottom: ImageVector
    get() {
        if (_innerShadowBottom != null) return _innerShadowBottom!!
        _innerShadowBottom = tablerFilledIcon(
            name = "InnerShadowBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.144f, 4.72f),
                    PathNode.CurveTo(9.064f, 1.025f, 15.237f, 1.095f, 19.071f, 4.929f),
                    PathNode.CurveTo(22.976f, 8.834f, 22.976f, 15.166f, 19.071f, 19.071f),
                    PathNode.CurveTo(15.166f, 22.976f, 8.834f, 22.976f, 4.929f, 19.071f),
                    PathNode.CurveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f),
                    PathNode.Close,
                    PathNode.MoveTo(8.464f, 15.536f),
                    PathNode.CurveTo(8.212926f, 15.276044f, 7.841122f, 15.171787f, 7.491493f, 15.263303f),
                    PathNode.CurveTo(7.141864f, 15.354818f, 6.868819f, 15.627863f, 6.777303f, 15.977492f),
                    PathNode.CurveTo(6.685787f, 16.327122f, 6.790044f, 16.698925f, 7.05f, 16.95f),
                    PathNode.CurveTo(8.362775f, 18.262909f, 10.143361f, 19.000505f, 12.0f, 19.000505f),
                    PathNode.CurveTo(13.856639f, 19.000505f, 15.637225f, 18.262909f, 16.95f, 16.95f),
                    PathNode.CurveTo(17.328972f, 16.557621f, 17.323553f, 15.933915f, 16.937819f, 15.548182f),
                    PathNode.CurveTo(16.552084f, 15.162448f, 15.928379f, 15.157028f, 15.536f, 15.536f),
                    PathNode.CurveTo(14.59828f, 16.473967f, 13.326311f, 17.000933f, 12.0f, 17.000933f),
                    PathNode.CurveTo(10.673689f, 17.000933f, 9.40172f, 16.473967f, 8.464f, 15.536f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _innerShadowBottom!!
    }

private var _innerShadowBottom: ImageVector? = null
