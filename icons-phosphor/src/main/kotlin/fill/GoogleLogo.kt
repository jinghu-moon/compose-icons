package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorFillIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 70.562386f, 185.4376f, 24.0f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(92.343864f, 207.99628f, 60.994396f, 184.39581f, 51.130478f, 150.13121f),
                    PathNode.CurveTo(41.266563f, 115.86661f, 55.269627f, 79.2103f, 85.46626f, 60.24921f),
                    PathNode.CurveTo(115.6629f, 41.288124f, 154.76282f, 44.600002f, 181.34f, 68.37f),
                    PathNode.CurveTo(184.54836f, 71.33512f, 184.78473f, 76.32577f, 181.87099f, 79.58085f),
                    PathNode.CurveTo(178.95726f, 82.83594f, 173.971f, 83.15162f, 170.67f, 80.29f),
                    PathNode.CurveTo(148.72128f, 60.658127f, 116.20926f, 58.53692f, 91.895744f, 75.15047f),
                    PathNode.CurveTo(67.58224f, 91.764015f, 57.74309f, 122.82399f, 68.05621f, 150.40652f),
                    PathNode.CurveTo(78.36934f, 177.98906f, 106.17269f, 194.97449f, 135.4217f, 191.56097f),
                    PathNode.CurveTo(164.67072f, 188.14746f, 187.81557f, 165.21613f, 191.5f, 136.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.CurveTo(123.58172f, 136.0f, 120.0f, 132.41827f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 123.58172f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.LineTo(200.0f, 120.0f),
                    PathNode.CurveTo(204.41827f, 120.0f, 208.0f, 123.58172f, 208.0f, 128.0f),
                    PathNode.CurveTo(207.9504f, 172.16223f, 172.16223f, 207.9504f, 128.0f, 208.0f),
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
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
