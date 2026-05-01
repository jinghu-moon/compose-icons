package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CellSignalSlash: ImageVector
    get() {
        if (_cellSignalSlash != null) return _cellSignalSlash!!
        _cellSignalSlash = phosphorFillIcon(
            name = "CellSignalSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.38f, 221.92f),
                    PathNode.CurveTo(210.11035f, 224.89098f, 205.05144f, 224.64922f, 202.08f, 221.38f),
                    PathNode.LineTo(196.57f, 215.32f),
                    PathNode.CurveTo(195.08725f, 215.76508f, 193.5481f, 215.9941f, 192.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(25.248459f, 216.001f, 19.222864f, 211.76389f, 16.94f, 205.41f),
                    PathNode.CurveTo(14.911954f, 199.43228f, 16.494732f, 192.82117f, 21.01f, 188.41f),
                    PathNode.LineTo(100.14f, 109.29f),
                    PathNode.LineTo(42.26f, 45.62f),
                    PathNode.CurveTo(39.248547f, 42.40245f, 39.310307f, 37.382492f, 42.4f, 34.24f),
                    PathNode.CurveTo(43.955997f, 32.735653f, 46.055122f, 31.92594f, 48.218296f, 31.995655f),
                    PathNode.CurveTo(50.381474f, 32.065376f, 52.424103f, 33.00858f, 53.88f, 34.61f),
                    PathNode.LineTo(213.88f, 210.61f),
                    PathNode.CurveTo(215.3148f, 212.17549f, 216.06831f, 214.2472f, 215.97453f, 216.36865f),
                    PathNode.CurveTo(215.88074f, 218.49011f, 214.94734f, 220.48724f, 213.38f, 221.92f),
                    PathNode.Close,
                    PathNode.MoveTo(201.0f, 172.66f),
                    PathNode.CurveTo(202.10567f, 173.91396f, 203.87456f, 174.34802f, 205.43509f, 173.74832f),
                    PathNode.CurveTo(206.99562f, 173.14864f, 208.0186f, 171.6417f, 208.0f, 169.97f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0051f, 33.524693f, 204.10677f, 27.684723f, 198.12465f, 25.206041f),
                    PathNode.CurveTo(192.14252f, 22.72736f, 185.25618f, 24.098717f, 180.68f, 28.68f),
                    PathNode.LineTo(125.47f, 83.88f),
                    PathNode.CurveTo(123.96004f, 85.39027f, 123.9028f, 87.82033f, 125.34f, 89.4f),
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
        return _cellSignalSlash!!
    }

private var _cellSignalSlash: ImageVector? = null
