package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelmetOff: ImageVector
    get() {
        if (_helmetOff != null) return _helmetOff!!
        _helmetOff = tablerOutlineIcon(
            name = "HelmetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.633f, 4.654f),
                    PathNode.CurveTo(11.978168f, 3.305027f, 15.805592f, 4.083506f, 18.358028f, 6.632023f),
                    PathNode.CurveTo(20.910467f, 9.18054f, 21.694828f, 13.006763f, 20.351f, 16.354f),
                    PathNode.MoveTo(18.848f, 18.84f),
                    PathNode.CurveTo(18.487291f, 19.2626f, 18.088257f, 19.65092f, 17.656f, 20.0f),
                    PathNode.LineTo(6.344f, 20.0f),
                    PathNode.CurveTo(4.262141f, 18.31779f, 3.037033f, 15.796244f, 3.001276f, 13.119924f),
                    PathNode.CurveTo(2.96552f, 10.443604f, 4.122825f, 7.890228f, 6.159f, 6.153f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.MoveTo(10.232f, 10.246f),
                    PathNode.CurveTo(10.739f, 12.246f, 11.828f, 13.664f, 13.5f, 14.5f),
                    PathNode.CurveTo(14.024f, 14.762f, 14.57f, 14.99f, 15.14f, 15.183f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _helmetOff!!
    }

private var _helmetOff: ImageVector? = null
