package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScubaMaskOff: ImageVector
    get() {
        if (_scubaMaskOff != null) return _scubaMaskOff!!
        _scubaMaskOff = tablerOutlineIcon(
            name = "ScubaMaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 7.0f),
                    PathNode.LineTo(16.0f, 7.0f),
                    PathNode.CurveTo(16.552284f, 7.0f, 17.0f, 7.447716f, 17.0f, 8.0f),
                    PathNode.LineTo(17.0f, 12.5f),
                    PathNode.CurveTo(17.0f, 12.654f, 16.986f, 12.804f, 16.96f, 12.95f),
                    PathNode.MoveTo(14.96f, 14.957f),
                    PathNode.CurveTo(14.81f, 14.985f, 14.655f, 15.0f, 14.497f, 15.0f),
                    PathNode.LineTo(13.997f, 15.0f),
                    PathNode.CurveTo(12.89243f, 15.0f, 11.997f, 14.104569f, 11.997f, 13.0f),
                    PathNode.CurveTo(11.997f, 11.895431f, 11.101569f, 11.0f, 9.997f, 11.0f),
                    PathNode.CurveTo(8.89243f, 11.0f, 7.997f, 11.895431f, 7.997f, 13.0f),
                    PathNode.CurveTo(7.997f, 14.104569f, 7.10157f, 15.0f, 5.997f, 15.0f),
                    PathNode.LineTo(5.497f, 15.0f),
                    PathNode.CurveTo(4.116288f, 15.0f, 2.997f, 13.880712f, 2.997f, 12.5f),
                    PathNode.LineTo(2.997f, 8.0f),
                    PathNode.CurveTo(2.997f, 7.447716f, 3.444715f, 7.0f, 3.997f, 7.0f),
                    PathNode.LineTo(6.997f, 7.0f)
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
                    PathNode.MoveTo(10.0f, 17.0f),
                    PathNode.CurveTo(10.0f, 18.10457f, 10.895431f, 19.0f, 12.0f, 19.0f),
                    PathNode.LineTo(15.5f, 19.0f),
                    PathNode.CurveTo(16.471346f, 19.001669f, 17.42565f, 18.744886f, 18.265f, 18.256f),
                    PathNode.MoveTo(20.265f, 16.256f),
                    PathNode.CurveTo(20.735f, 15.446f, 21.004f, 14.504f, 21.004f, 13.5f),
                    PathNode.LineTo(21.004f, 4.0f)
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
        return _scubaMaskOff!!
    }

private var _scubaMaskOff: ImageVector? = null
