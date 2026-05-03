package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RecycleOff: ImageVector
    get() {
        if (_recycleOff != null) return _recycleOff!!
        _recycleOff = tablerOutlineIcon(
            name = "RecycleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.MoveTo(10.0f, 19.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.MoveTo(20.896f, 16.929f),
                    PathNode.CurveTo(20.887304f, 16.695885f, 20.837893f, 16.466087f, 20.75f, 16.25f),
                    PathNode.LineTo(20.2f, 15.25f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.536f, 11.0f),
                    PathNode.LineTo(7.804f, 8.268f),
                    PathNode.LineTo(5.072f, 9.0f),
                    PathNode.MoveTo(7.804f, 8.268f),
                    PathNode.LineTo(3.304f, 16.062f),
                    PathNode.CurveTo(3.009876f, 16.638388f, 3.012795f, 17.321459f, 3.311834f, 17.895311f),
                    PathNode.CurveTo(3.610872f, 18.469164f, 4.169073f, 18.862873f, 4.81f, 18.952f),
                    PathNode.LineTo(5.951f, 18.976f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.464f, 11.0f),
                    PathNode.LineTo(18.196f, 11.732f),
                    PathNode.LineTo(18.928f, 9.0f),
                    PathNode.MoveTo(18.196f, 11.732f),
                    PathNode.LineTo(13.696f, 3.938f),
                    PathNode.CurveTo(13.343778f, 3.395109f, 12.750645f, 3.056195f, 12.104101f, 3.028395f),
                    PathNode.CurveTo(11.457558f, 3.000595f, 10.837522f, 3.287346f, 10.44f, 3.798f),
                    PathNode.LineTo(9.849f, 4.774f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
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
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _recycleOff!!
    }

private var _recycleOff: ImageVector? = null
