package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorDuotoneIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 215.63f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(136.0f, 179.58173f, 132.41827f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(123.58172f, 176.0f, 120.0f, 179.58173f, 120.0f, 184.0f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(77.74777f, 211.71811f, 44.281887f, 178.25223f, 40.37f, 136.0f),
                    PathNode.LineTo(72.0f, 136.0f),
                    PathNode.CurveTo(76.41828f, 136.0f, 80.0f, 132.41827f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 123.58172f, 76.41828f, 120.0f, 72.0f, 120.0f),
                    PathNode.LineTo(40.37f, 120.0f),
                    PathNode.CurveTo(44.281887f, 77.74777f, 77.74777f, 44.281887f, 120.0f, 40.37f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(120.0f, 76.41828f, 123.58172f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(132.41827f, 80.0f, 136.0f, 76.41828f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(178.25223f, 44.281887f, 211.71811f, 77.74777f, 215.63f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(179.58173f, 120.0f, 176.0f, 123.58172f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 132.41827f, 179.58173f, 136.0f, 184.0f, 136.0f),
                    PathNode.LineTo(215.63f, 136.0f),
                    PathNode.CurveTo(211.71811f, 178.25223f, 178.25223f, 211.71811f, 136.0f, 215.63f),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
