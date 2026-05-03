package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) return _videoCameraSlash!!
        _videoCameraSlash = phosphorFillIcon(
            name = "VideoCameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 80.23f),
                    PathNode.LineTo(256.0f, 175.68f),
                    PathNode.CurveTo(256.0488f, 178.57887f, 254.58676f, 181.2946f, 252.14f, 182.85f),
                    PathNode.CurveTo(249.48515f, 184.45587f, 246.14116f, 184.38182f, 243.56f, 182.66f),
                    PathNode.LineTo(209.78f, 160.14f),
                    PathNode.CurveTo(208.66713f, 159.3975f, 207.99913f, 158.14783f, 208.0f, 156.81f),
                    PathNode.LineTo(208.0f, 99.19f),
                    PathNode.CurveTo(208.00246f, 97.85572f, 208.67007f, 96.61053f, 209.78f, 95.87f),
                    PathNode.LineTo(243.56f, 73.34f),
                    PathNode.CurveTo(246.57802f, 71.32917f, 250.57117f, 71.60003f, 253.29f, 74.0f),
                    PathNode.CurveTo(255.04832f, 75.58952f, 256.03595f, 77.85998f, 256.0f, 80.23f),
                    PathNode.Close,
                    PathNode.MoveTo(53.92f, 34.62f),
                    PathNode.CurveTo(52.008102f, 32.46484f, 49.085068f, 31.50414f, 46.26741f, 32.104855f),
                    PathNode.CurveTo(43.44975f, 32.70557f, 41.17271f, 34.774906f, 40.30605f, 37.52244f),
                    PathNode.CurveTo(39.439384f, 40.26998f, 40.116978f, 43.271305f, 42.08f, 45.38f),
                    PathNode.LineTo(51.73f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(23.163445f, 56.0f, 16.0f, 63.163445f, 16.0f, 72.0f),
                    PathNode.LineTo(16.0f, 184.0f),
                    PathNode.CurveTo(16.0f, 192.83656f, 23.163445f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(182.64f, 200.0f),
                    PathNode.LineTo(202.08f, 221.38f),
                    PathNode.CurveTo(203.9919f, 223.53516f, 206.91493f, 224.49586f, 209.73259f, 223.89514f),
                    PathNode.CurveTo(212.55025f, 223.29443f, 214.82729f, 221.2251f, 215.69395f, 218.47755f),
                    PathNode.CurveTo(216.56061f, 215.73003f, 215.88303f, 212.7287f, 213.92f, 210.62f),
                    PathNode.Close,
                    PathNode.MoveTo(185.0f, 155.07f),
                    PathNode.CurveTo(186.10686f, 156.32542f, 187.87831f, 156.75899f, 189.43987f, 156.15668f),
                    PathNode.CurveTo(191.00142f, 155.55437f, 192.02287f, 154.04353f, 192.0f, 152.37f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(192.0f, 63.163445f, 184.83656f, 56.0f, 176.0f, 56.0f),
                    PathNode.LineTo(104.0f, 56.0f),
                    PathNode.CurveTo(102.40971f, 55.98418f, 100.96112f, 56.91197f, 100.31038f, 58.36311f),
                    PathNode.CurveTo(99.659645f, 59.81425f, 99.9304f, 61.513046f, 101.0f, 62.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
