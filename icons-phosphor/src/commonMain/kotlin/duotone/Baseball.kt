package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Baseball: ImageVector
    get() {
        if (_baseball != null) return _baseball!!
        _baseball = phosphorDuotoneIcon(
            name = "Baseball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.66f, 59.58f),
                    PathNode.CurveTo(79.02323f, 77.60696f, 89.35659f, 102.267166f, 89.33f, 128.0f),
                    PathNode.CurveTo(89.35659f, 153.73283f, 79.02323f, 178.39305f, 60.66f, 196.42f),
                    PathNode.CurveTo(42.32524f, 178.3746f, 32.000206f, 153.72545f, 32.000206f, 128.0f),
                    PathNode.CurveTo(32.000206f, 102.27453f, 42.32524f, 77.625404f, 60.66f, 59.58f),
                    PathNode.Close,
                    PathNode.MoveTo(195.34f, 59.58f),
                    PathNode.CurveTo(177.00525f, 77.625404f, 166.6802f, 102.27453f, 166.6802f, 128.0f),
                    PathNode.CurveTo(166.6802f, 153.72545f, 177.00525f, 178.3746f, 195.34f, 196.42f),
                    PathNode.CurveTo(213.67476f, 178.3746f, 223.99979f, 153.72545f, 223.99979f, 128.0f),
                    PathNode.CurveTo(223.99979f, 102.27453f, 213.67476f, 77.625404f, 195.34f, 59.58f),
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
                    PathNode.MoveTo(72.09f, 195.91f),
                    PathNode.CurveTo(72.91f, 194.91f, 73.73f, 193.98f, 74.51f, 193.0f),
                    PathNode.CurveTo(77.27142f, 189.54546f, 76.70954f, 184.50641f, 73.255f, 181.745f),
                    PathNode.CurveTo(69.80046f, 178.98358f, 64.76142f, 179.54546f, 62.0f, 183.0f),
                    PathNode.LineTo(60.66f, 184.62f),
                    PathNode.CurveTo(33.074238f, 151.91335f, 33.074238f, 104.086655f, 60.66f, 71.38f),
                    PathNode.LineTo(62.0f, 73.0f),
                    PathNode.CurveTo(64.76142f, 76.454544f, 69.80046f, 77.016426f, 73.255f, 74.255f),
                    PathNode.CurveTo(76.70954f, 71.493576f, 77.27142f, 66.454544f, 74.51f, 63.0f),
                    PathNode.CurveTo(73.73f, 62.0f, 72.91f, 61.0f, 72.09f, 60.09f),
                    PathNode.CurveTo(104.5503f, 33.302105f, 151.4497f, 33.302105f, 183.91f, 60.09f),
                    PathNode.CurveTo(183.09f, 61.09f, 182.27f, 62.01f, 181.49f, 63.0f),
                    PathNode.CurveTo(178.72858f, 66.454544f, 179.29047f, 71.493576f, 182.745f, 74.255f),
                    PathNode.CurveTo(186.19954f, 77.016426f, 191.23857f, 76.454544f, 194.0f, 73.0f),
                    PathNode.LineTo(195.34f, 71.38f),
                    PathNode.CurveTo(222.92577f, 104.086655f, 222.92577f, 151.91335f, 195.34f, 184.62f),
                    PathNode.LineTo(194.0f, 183.0f),
                    PathNode.CurveTo(192.24754f, 180.66722f, 189.36401f, 179.47351f, 186.47545f, 179.88503f),
                    PathNode.CurveTo(183.58691f, 180.29655f, 181.15149f, 182.24802f, 180.1202f, 184.9774f),
                    PathNode.CurveTo(179.08891f, 187.70677f, 179.62532f, 190.78116f, 181.52f, 193.0f),
                    PathNode.CurveTo(182.3f, 194.0f, 183.12f, 194.95f, 183.94f, 195.91f),
                    PathNode.CurveTo(151.4797f, 222.69789f, 104.5803f, 222.69789f, 72.12f, 195.91f),
                    PathNode.Close,
                    PathNode.MoveTo(95.89f, 145.32f),
                    PathNode.CurveTo(94.89618f, 151.22093f, 93.39734f, 157.0256f, 91.41f, 162.67f),
                    PathNode.CurveTo(89.9354f, 166.83699f, 85.36199f, 169.0196f, 81.195f, 167.545f),
                    PathNode.CurveTo(77.028015f, 166.0704f, 74.8454f, 161.497f, 76.32f, 157.33f),
                    PathNode.CurveTo(78.00594f, 152.56586f, 79.27406f, 147.66403f, 80.11f, 142.68f),
                    PathNode.CurveTo(80.55821f, 139.83934f, 82.49663f, 137.45784f, 85.187126f, 136.44229f),
                    PathNode.CurveTo(87.87764f, 135.42673f, 90.906204f, 135.93341f, 93.11966f, 137.76941f),
                    PathNode.CurveTo(95.33311f, 139.6054f, 96.3908f, 142.48814f, 95.89f, 145.32f),
                    PathNode.Close,
                    PathNode.MoveTo(95.89f, 110.68f),
                    PathNode.CurveTo(96.61881f, 115.03748f, 93.67742f, 119.16081f, 89.32f, 119.89f),
                    PathNode.CurveTo(88.88352f, 119.96087f, 88.442184f, 119.99764f, 88.0f, 120.0f),
                    PathNode.CurveTo(84.09505f, 119.99495f, 80.76431f, 117.17144f, 80.12f, 113.32f),
                    PathNode.CurveTo(79.284065f, 108.33596f, 78.015945f, 103.434135f, 76.33f, 98.67f),
                    PathNode.CurveTo(74.8554f, 94.50301f, 77.03801f, 89.9296f, 81.205f, 88.455f),
                    PathNode.CurveTo(85.37199f, 86.9804f, 89.9454f, 89.16301f, 91.42f, 93.33f),
                    PathNode.CurveTo(93.403946f, 98.9747f, 94.89944f, 104.779366f, 95.89f, 110.68f),
                    PathNode.Close,
                    PathNode.MoveTo(174.8f, 167.54f),
                    PathNode.CurveTo(170.63582f, 169.01387f, 166.06514f, 166.83374f, 164.59f, 162.67f),
                    PathNode.CurveTo(162.60266f, 157.0256f, 161.10382f, 151.22093f, 160.11f, 145.32f),
                    PathNode.CurveTo(159.6092f, 142.48814f, 160.66689f, 139.6054f, 162.88034f, 137.76941f),
                    PathNode.CurveTo(165.09378f, 135.93341f, 168.12238f, 135.42673f, 170.81287f, 136.44229f),
                    PathNode.CurveTo(173.50339f, 137.45784f, 175.44179f, 139.83934f, 175.89f, 142.68f),
                    PathNode.CurveTo(176.72594f, 147.66403f, 177.99405f, 152.56586f, 179.68f, 157.33f),
                    PathNode.CurveTo(180.38731f, 159.33104f, 180.2705f, 161.53111f, 179.35522f, 163.44601f),
                    PathNode.CurveTo(178.44f, 165.36089f, 176.80136f, 166.8336f, 174.8f, 167.54f),
                    PathNode.Close,
                    PathNode.MoveTo(160.11f, 110.68f),
                    PathNode.CurveTo(161.10382f, 104.77906f, 162.60266f, 98.974396f, 164.59f, 93.33f),
                    PathNode.CurveTo(166.0646f, 89.16301f, 170.63802f, 86.9804f, 174.805f, 88.455f),
                    PathNode.CurveTo(178.97198f, 89.9296f, 181.1546f, 94.50301f, 179.68f, 98.67f),
                    PathNode.CurveTo(177.99405f, 103.434135f, 176.72594f, 108.33596f, 175.89f, 113.32f),
                    PathNode.CurveTo(175.24506f, 117.17516f, 171.90874f, 119.99983f, 168.0f, 120.0f),
                    PathNode.CurveTo(167.55447f, 119.99816f, 167.10977f, 119.96139f, 166.67f, 119.89f),
                    PathNode.CurveTo(162.31665f, 119.15597f, 159.38081f, 115.03418f, 160.11f, 110.68f),
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
        return _baseball!!
    }

private var _baseball: ImageVector? = null
