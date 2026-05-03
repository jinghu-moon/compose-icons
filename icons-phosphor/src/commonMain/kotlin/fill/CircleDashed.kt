package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorFillIcon(
            name = "CircleDashed",
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
                    PathNode.MoveTo(182.59f, 69.0f),
                    PathNode.CurveTo(185.90123f, 66.07646f, 190.95528f, 66.389824f, 193.88f, 69.7f),
                    PathNode.CurveTo(201.73817f, 78.5682f, 207.7245f, 88.93202f, 211.48f, 100.17f),
                    PathNode.CurveTo(212.8828f, 104.36184f, 210.62184f, 108.897194f, 206.43f, 110.3f),
                    PathNode.CurveTo(202.23816f, 111.702805f, 197.7028f, 109.44184f, 196.3f, 105.25f),
                    PathNode.CurveTo(193.23915f, 96.029f, 188.34047f, 87.52434f, 181.9f, 80.25f),
                    PathNode.CurveTo(179.00084f, 76.94706f, 179.30893f, 71.92389f, 182.59f, 69.0f),
                    PathNode.Close,
                    PathNode.MoveTo(73.41f, 187.05f),
                    PathNode.CurveTo(70.09878f, 189.97354f, 65.04472f, 189.66017f, 62.12f, 186.35f),
                    PathNode.CurveTo(54.261826f, 177.4818f, 48.2755f, 167.11798f, 44.52f, 155.88f),
                    PathNode.CurveTo(43.117195f, 151.68816f, 45.37816f, 147.1528f, 49.57f, 145.75f),
                    PathNode.CurveTo(53.76184f, 144.3472f, 58.297195f, 146.60815f, 59.7f, 150.8f),
                    PathNode.CurveTo(62.76696f, 160.00328f, 67.665344f, 168.4904f, 74.1f, 175.75f),
                    PathNode.CurveTo(75.508286f, 177.33937f, 76.22688f, 179.42345f, 76.09746f, 181.54303f),
                    PathNode.CurveTo(75.968025f, 183.66261f, 75.001205f, 185.64378f, 73.41f, 187.05f),
                    PathNode.Close,
                    PathNode.MoveTo(74.1f, 80.25f),
                    PathNode.CurveTo(67.65953f, 87.52434f, 62.760845f, 96.029f, 59.7f, 105.25f),
                    PathNode.CurveTo(58.297195f, 109.44184f, 53.76184f, 111.702805f, 49.57f, 110.3f),
                    PathNode.CurveTo(45.37816f, 108.897194f, 43.117195f, 104.36184f, 44.52f, 100.17f),
                    PathNode.CurveTo(48.2755f, 88.93202f, 54.261826f, 78.5682f, 62.12f, 69.7f),
                    PathNode.CurveTo(65.04711f, 66.38629f, 70.10629f, 66.07289f, 73.42f, 69.0f),
                    PathNode.CurveTo(76.73371f, 71.92711f, 77.04711f, 76.98629f, 74.12f, 80.3f),
                    PathNode.Close,
                    PathNode.MoveTo(145.59f, 214.25f),
                    PathNode.CurveTo(133.98343f, 216.6234f, 122.01658f, 216.6234f, 110.41f, 214.25f),
                    PathNode.CurveTo(106.11909f, 213.33536f, 103.36538f, 209.13548f, 104.2374f, 204.8357f),
                    PathNode.CurveTo(105.10942f, 200.53592f, 109.281784f, 197.74068f, 113.59f, 198.57f),
                    PathNode.CurveTo(123.09871f, 200.51012f, 132.90129f, 200.51012f, 142.41f, 198.57f),
                    PathNode.CurveTo(146.7182f, 197.74068f, 150.89058f, 200.53592f, 151.7626f, 204.8357f),
                    PathNode.CurveTo(152.63461f, 209.13548f, 149.88092f, 213.33536f, 145.59f, 214.25f),
                    PathNode.Close,
                    PathNode.MoveTo(151.84f, 51.25f),
                    PathNode.CurveTo(151.06306f, 54.959427f, 147.78992f, 57.614693f, 144.0f, 57.61f),
                    PathNode.CurveTo(143.4626f, 57.611294f, 142.9265f, 57.557686f, 142.4f, 57.45f),
                    PathNode.CurveTo(132.89128f, 55.509884f, 123.088715f, 55.509884f, 113.58f, 57.45f),
                    PathNode.CurveTo(110.766174f, 58.049786f, 107.84699f, 57.09246f, 105.93483f, 54.942814f),
                    PathNode.CurveTo(104.02267f, 52.79317f, 103.41204f, 49.78232f, 104.33565f, 47.05756f),
                    PathNode.CurveTo(105.259254f, 44.3328f, 107.57483f, 42.313835f, 110.4f, 41.77f),
                    PathNode.CurveTo(122.00691f, 39.399906f, 133.97308f, 39.399906f, 145.58f, 41.77f),
                    PathNode.CurveTo(147.66109f, 42.18951f, 149.4901f, 43.419f, 150.66423f, 45.187702f),
                    PathNode.CurveTo(151.83836f, 46.956413f, 152.26134f, 49.11928f, 151.84f, 51.2f),
                    PathNode.Close,
                    PathNode.MoveTo(211.48f, 155.93f),
                    PathNode.CurveTo(207.7245f, 167.16798f, 201.73817f, 177.5318f, 193.88f, 186.4f),
                    PathNode.CurveTo(190.9529f, 189.71371f, 185.8937f, 190.02711f, 182.58f, 187.1f),
                    PathNode.CurveTo(179.2663f, 184.1729f, 178.9529f, 179.11371f, 181.88f, 175.8f),
                    PathNode.CurveTo(188.31465f, 168.5404f, 193.21304f, 160.05327f, 196.28f, 150.85f),
                    PathNode.CurveTo(197.6828f, 146.65816f, 202.21815f, 144.3972f, 206.41f, 145.8f),
                    PathNode.CurveTo(210.60184f, 147.2028f, 212.86282f, 151.73816f, 211.46f, 155.93f),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
