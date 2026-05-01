package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorLightIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 112.0f),
                    PathNode.CurveTo(222.0f, 134.05f, 214.3f, 154.19f, 200.32f, 168.73f),
                    PathNode.CurveTo(187.32f, 182.25f, 169.71f, 190.0f, 152.0f, 190.0f),
                    PathNode.CurveTo(132.58f, 190.0f, 120.45f, 182.93f, 113.37f, 176.36f),
                    PathNode.LineTo(101.84f, 225.36f),
                    PathNode.CurveTo(101.20798f, 228.07576f, 98.78834f, 229.99821f, 96.0f, 230.0f),
                    PathNode.CurveTo(95.53864f, 230.0005f, 95.07883f, 229.9468f, 94.63f, 229.84f),
                    PathNode.CurveTo(91.40517f, 229.08266f, 89.40423f, 225.85521f, 90.16f, 222.63f),
                    PathNode.LineTo(122.16f, 86.63f),
                    PathNode.CurveTo(122.60996f, 84.501915f, 124.17643f, 82.784004f, 126.254074f, 82.14012f),
                    PathNode.CurveTo(128.33173f, 81.49623f, 130.59514f, 82.02721f, 132.16971f, 83.52786f),
                    PathNode.CurveTo(133.74426f, 85.02852f, 134.38335f, 87.263824f, 133.84f, 89.37f),
                    PathNode.LineTo(116.75f, 162.0f),
                    PathNode.CurveTo(119.55f, 166.33f, 129.21f, 178.0f, 152.0f, 178.0f),
                    PathNode.CurveTo(180.51f, 178.0f, 210.0f, 153.31f, 210.0f, 112.0f),
                    PathNode.CurveTo(209.98972f, 80.896965f, 190.5313f, 53.120003f, 161.30301f, 42.484863f),
                    PathNode.CurveTo(132.07472f, 31.84972f, 99.31567f, 40.626587f, 79.31959f, 64.45001f),
                    PathNode.CurveTo(59.32349f, 88.27344f, 56.35877f, 122.058044f, 71.9f, 149.0f),
                    PathNode.CurveTo(73.01911f, 150.8588f, 73.04752f, 153.17696f, 71.974304f, 155.06262f),
                    PathNode.CurveTo(70.90109f, 156.94827f, 68.89346f, 158.10764f, 66.72382f, 158.09465f),
                    PathNode.CurveTo(64.554184f, 158.08168f, 62.560574f, 156.89838f, 61.51f, 155.0f),
                    PathNode.CurveTo(43.44417f, 123.68919f, 46.887f, 84.42313f, 70.12592f, 56.733894f),
                    PathNode.CurveTo(93.364845f, 29.044668f, 131.43866f, 18.843573f, 165.40831f, 31.204935f),
                    PathNode.CurveTo(199.37798f, 43.5663f, 221.9914f, 75.85113f, 222.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
