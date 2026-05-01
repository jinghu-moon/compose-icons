package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretCircleDown: ImageVector
    get() {
        if (_caretCircleDown != null) return _caretCircleDown!!
        _caretCircleDown = phosphorFillIcon(
            name = "CaretCircleDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.66f, 117.66f),
                    PathNode.LineTo(133.66f, 157.66f),
                    PathNode.CurveTo(132.15945f, 159.16223f, 130.12328f, 160.00629f, 128.0f, 160.00629f),
                    PathNode.CurveTo(125.876724f, 160.00629f, 123.840546f, 159.16223f, 122.34f, 157.66f),
                    PathNode.LineTo(82.34f, 117.66f),
                    PathNode.CurveTo(79.214066f, 114.534065f, 79.214066f, 109.465935f, 82.34f, 106.34f),
                    PathNode.CurveTo(85.465935f, 103.214066f, 90.534065f, 103.214066f, 93.66f, 106.34f),
                    PathNode.LineTo(128.0f, 140.69f),
                    PathNode.LineTo(162.34f, 106.34f),
                    PathNode.CurveTo(165.46593f, 103.214066f, 170.53407f, 103.214066f, 173.66f, 106.34f),
                    PathNode.CurveTo(176.78593f, 109.465935f, 176.78593f, 114.534065f, 173.66f, 117.66f),
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
        return _caretCircleDown!!
    }

private var _caretCircleDown: ImageVector? = null
