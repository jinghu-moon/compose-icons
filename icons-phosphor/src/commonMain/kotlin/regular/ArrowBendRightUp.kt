package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorRegularIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(205.66f, 85.66f),
                    PathNode.CurveTo(204.15945f, 87.16222f, 202.12328f, 88.006294f, 200.0f, 88.006294f),
                    PathNode.CurveTo(197.87672f, 88.006294f, 195.84055f, 87.16222f, 194.34f, 85.66f),
                    PathNode.LineTo(160.0f, 51.31f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(159.93938f, 185.41248f, 113.41248f, 231.93938f, 56.0f, 232.0f),
                    PathNode.CurveTo(51.581722f, 232.0f, 48.0f, 228.41827f, 48.0f, 224.0f),
                    PathNode.CurveTo(48.0f, 219.58173f, 51.581722f, 216.0f, 56.0f, 216.0f),
                    PathNode.CurveTo(104.57822f, 215.94489f, 143.94489f, 176.57822f, 144.0f, 128.0f),
                    PathNode.LineTo(144.0f, 51.31f),
                    PathNode.LineTo(109.66f, 85.66f),
                    PathNode.CurveTo(106.534065f, 88.785934f, 101.465935f, 88.785934f, 98.34f, 85.66f),
                    PathNode.CurveTo(95.214066f, 82.534065f, 95.214066f, 77.465935f, 98.34f, 74.34f),
                    PathNode.LineTo(146.34f, 26.34f),
                    PathNode.CurveTo(147.84055f, 24.837784f, 149.87672f, 23.993708f, 152.0f, 23.993708f),
                    PathNode.CurveTo(154.12328f, 23.993708f, 156.15945f, 24.837784f, 157.66f, 26.34f),
                    PathNode.LineTo(205.66f, 74.34f),
                    PathNode.CurveTo(207.16223f, 75.840546f, 208.00629f, 77.876724f, 208.00629f, 80.0f),
                    PathNode.CurveTo(208.00629f, 82.123276f, 207.16223f, 84.159454f, 205.66f, 85.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
