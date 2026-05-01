package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ProhibitInset: ImageVector
    get() {
        if (_prohibitInset != null) return _prohibitInset!!
        _prohibitInset = phosphorFillIcon(
            name = "ProhibitInset",
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
                    PathNode.MoveTo(165.66f, 165.66f),
                    PathNode.CurveTo(164.15945f, 167.16223f, 162.12328f, 168.00629f, 160.0f, 168.00629f),
                    PathNode.CurveTo(157.87672f, 168.00629f, 155.84055f, 167.16223f, 154.34f, 165.66f),
                    PathNode.LineTo(90.34f, 101.66f),
                    PathNode.CurveTo(87.214066f, 98.534065f, 87.214066f, 93.465935f, 90.34f, 90.34f),
                    PathNode.CurveTo(93.465935f, 87.214066f, 98.534065f, 87.214066f, 101.66f, 90.34f),
                    PathNode.LineTo(165.66f, 154.34f),
                    PathNode.CurveTo(167.16223f, 155.84055f, 168.00629f, 157.87672f, 168.00629f, 160.0f),
                    PathNode.CurveTo(168.00629f, 162.12328f, 167.16223f, 164.15945f, 165.66f, 165.66f),
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
        return _prohibitInset!!
    }

private var _prohibitInset: ImageVector? = null
