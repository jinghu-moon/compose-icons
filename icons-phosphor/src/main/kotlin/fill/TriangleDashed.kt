package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TriangleDashed: ImageVector
    get() {
        if (_triangleDashed != null) return _triangleDashed!!
        _triangleDashed = phosphorFillIcon(
            name = "TriangleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.8f, 188.09f),
                    PathNode.LineTo(149.35f, 36.22f),
                    PathNode.CurveTo(144.90347f, 28.649155f, 136.78006f, 23.999342f, 128.0f, 23.999342f),
                    PathNode.CurveTo(119.21994f, 23.999342f, 111.09653f, 28.649155f, 106.65f, 36.22f),
                    PathNode.LineTo(19.2f, 188.09f),
                    PathNode.CurveTo(14.919031f, 195.41719f, 14.919031f, 204.4828f, 19.2f, 211.81f),
                    PathNode.CurveTo(23.590843f, 219.433f, 31.75336f, 224.09348f, 40.55f, 224.0f),
                    PathNode.LineTo(215.45f, 224.0f),
                    PathNode.CurveTo(224.23952f, 224.08621f, 232.39267f, 219.42673f, 236.78f, 211.81f),
                    PathNode.CurveTo(241.06715f, 204.48642f, 241.0748f, 195.4208f, 236.8f, 188.09f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 200.0f),
                    PathNode.LineTo(60.79f, 200.0f),
                    PathNode.CurveTo(56.503223f, 199.99919f, 52.542454f, 197.71167f, 50.399426f, 193.99901f),
                    PathNode.CurveTo(48.256393f, 190.28635f, 48.25661f, 185.71246f, 50.4f, 182.0f),
                    PathNode.LineTo(74.58f, 140.0f),
                    PathNode.CurveTo(76.78914f, 136.1699f, 81.684906f, 134.85587f, 85.515f, 137.065f),
                    PathNode.CurveTo(89.34509f, 139.27414f, 90.65914f, 144.1699f, 88.45f, 148.0f),
                    PathNode.LineTo(67.71f, 184.0f),
                    PathNode.LineTo(108.0f, 184.0f),
                    PathNode.CurveTo(112.41828f, 184.0f, 116.0f, 187.58173f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 196.41827f, 112.41828f, 200.0f, 108.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.88f, 116.0f),
                    PathNode.CurveTo(104.67086f, 119.832855f, 99.77286f, 121.14914f, 95.94f, 118.94f),
                    PathNode.CurveTo(92.10715f, 116.73086f, 90.79086f, 111.832855f, 93.0f, 108.0f),
                    PathNode.LineTo(117.59f, 65.3f),
                    PathNode.CurveTo(119.73157f, 61.579666f, 123.69731f, 59.28665f, 127.99f, 59.28665f),
                    PathNode.CurveTo(132.2827f, 59.28665f, 136.24843f, 61.579666f, 138.39f, 65.3f),
                    PathNode.LineTo(163.0f, 108.0f),
                    PathNode.CurveTo(165.20914f, 111.83009f, 163.89508f, 116.72586f, 160.065f, 118.935f),
                    PathNode.CurveTo(156.23491f, 121.14414f, 151.33914f, 119.83009f, 149.13f, 116.0f),
                    PathNode.LineTo(128.0f, 79.31f),
                    PathNode.Close,
                    PathNode.MoveTo(205.6f, 194.0f),
                    PathNode.CurveTo(203.44931f, 197.70459f, 199.4936f, 199.98892f, 195.21f, 200.0f),
                    PathNode.LineTo(148.0f, 200.0f),
                    PathNode.CurveTo(143.58173f, 200.0f, 140.0f, 196.41827f, 140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 187.58173f, 143.58173f, 184.0f, 148.0f, 184.0f),
                    PathNode.LineTo(188.29f, 184.0f),
                    PathNode.LineTo(167.55f, 148.0f),
                    PathNode.CurveTo(165.34087f, 144.1699f, 166.6549f, 139.27414f, 170.485f, 137.065f),
                    PathNode.CurveTo(174.3151f, 134.85587f, 179.21086f, 136.1699f, 181.42f, 140.0f),
                    PathNode.LineTo(205.6f, 182.0f),
                    PathNode.CurveTo(207.74359f, 185.71281f, 207.74359f, 190.28719f, 205.6f, 194.0f),
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
        return _triangleDashed!!
    }

private var _triangleDashed: ImageVector? = null
