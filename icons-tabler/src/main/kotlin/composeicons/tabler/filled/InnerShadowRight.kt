package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InnerShadowRight: ImageVector
    get() {
        if (_innerShadowRight != null) return _innerShadowRight!!
        _innerShadowRight = tablerFilledIcon(
            name = "InnerShadowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.929f, 4.929f),
                    PathNode.CurveTo(8.834f, 1.024f, 15.166f, 1.024f, 19.071f, 4.929f),
                    PathNode.CurveTo(22.976f, 8.834f, 22.976f, 15.166f, 19.071f, 19.071f),
                    PathNode.CurveTo(15.166f, 22.976f, 8.834f, 22.976f, 4.929f, 19.071f),
                    PathNode.CurveTo(1.024f, 15.166f, 1.024f, 8.834f, 4.929f, 4.929f),
                    PathNode.Close,
                    PathNode.MoveTo(16.949f, 7.05f),
                    PathNode.CurveTo(16.555155f, 6.680677f, 15.939255f, 6.690678f, 15.55761f, 7.072594f),
                    PathNode.CurveTo(15.175963f, 7.45451f, 15.166398f, 8.070417f, 15.536f, 8.464f),
                    PathNode.CurveTo(16.473967f, 9.40172f, 17.000933f, 10.673689f, 17.000933f, 12.0f),
                    PathNode.CurveTo(17.000933f, 13.326311f, 16.473967f, 14.59828f, 15.536f, 15.536f),
                    PathNode.CurveTo(15.157028f, 15.928379f, 15.162448f, 16.552084f, 15.548182f, 16.937819f),
                    PathNode.CurveTo(15.933915f, 17.323553f, 16.557621f, 17.328972f, 16.95f, 16.95f),
                    PathNode.CurveTo(18.262909f, 15.637225f, 19.000505f, 13.856639f, 19.000505f, 12.0f),
                    PathNode.CurveTo(19.000505f, 10.143361f, 18.262909f, 8.362775f, 16.95f, 7.05f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _innerShadowRight!!
    }

private var _innerShadowRight: ImageVector? = null
