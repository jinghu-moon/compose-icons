package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorThinIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 168.0f),
                    PathNode.LineTo(244.0f, 200.0f),
                    PathNode.CurveTo(244.0f, 202.20914f, 242.20914f, 204.0f, 240.0f, 204.0f),
                    PathNode.CurveTo(237.79086f, 204.0f, 236.0f, 202.20914f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 177.66f),
                    PathNode.LineTo(226.9f, 186.76f),
                    PathNode.CurveTo(224.52f, 189.37f, 188.3f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(66.92f, 228.0f, 30.55f, 188.36f, 29.0f, 186.68f),
                    PathNode.CurveTo(27.519876f, 185.02315f, 27.663145f, 182.48012f, 29.32f, 181.0f),
                    PathNode.CurveTo(30.976854f, 179.51988f, 33.51988f, 179.66315f, 35.0f, 181.32f),
                    PathNode.CurveTo(35.35f, 181.71f, 70.63f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(185.37f, 220.0f, 220.68f, 181.71f, 221.0f, 181.32f),
                    PathNode.LineTo(221.14f, 181.17f),
                    PathNode.LineTo(230.31f, 172.0f),
                    PathNode.LineTo(208.0f, 172.0f),
                    PathNode.CurveTo(205.79086f, 172.0f, 204.0f, 170.20914f, 204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 165.79086f, 205.79086f, 164.0f, 208.0f, 164.0f),
                    PathNode.LineTo(240.0f, 164.0f),
                    PathNode.CurveTo(242.20914f, 164.0f, 244.0f, 165.79086f, 244.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 105.51f),
                    PathNode.LineTo(164.0f, 84.0f),
                    PathNode.CurveTo(164.00919f, 65.50201f, 151.33354f, 49.41058f, 133.34776f, 45.08771f),
                    PathNode.CurveTo(115.36197f, 40.764847f, 96.75815f, 49.338284f, 88.36f, 65.82f),
                    PathNode.CurveTo(87.73531f, 67.136604f, 86.44404f, 68.0093f, 84.98945f, 68.097946f),
                    PathNode.CurveTo(83.53486f, 68.186584f, 82.14716f, 67.47715f, 81.367226f, 66.24614f),
                    PathNode.CurveTo(80.587296f, 65.01513f, 80.53855f, 63.457363f, 81.24f, 62.18f),
                    PathNode.CurveTo(91.32254f, 42.410522f, 113.64288f, 32.130157f, 135.2202f, 37.31765f),
                    PathNode.CurveTo(156.79749f, 42.505142f, 172.00562f, 61.807884f, 172.0f, 84.0f),
                    PathNode.LineTo(172.0f, 176.0f),
                    PathNode.CurveTo(172.0f, 178.20914f, 170.20914f, 180.0f, 168.0f, 180.0f),
                    PathNode.CurveTo(165.79086f, 180.0f, 164.0f, 178.20914f, 164.0f, 176.0f),
                    PathNode.LineTo(164.0f, 158.49f),
                    PathNode.CurveTo(152.30693f, 176.14957f, 130.42142f, 184.05797f, 110.14068f, 177.95221f),
                    PathNode.CurveTo(89.85994f, 171.84647f, 75.978134f, 153.1699f, 75.978134f, 131.99f),
                    PathNode.CurveTo(75.978134f, 110.81009f, 89.85994f, 92.13354f, 110.14068f, 86.02779f),
                    PathNode.CurveTo(130.42142f, 79.922035f, 152.30693f, 87.83043f, 164.0f, 105.49f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 132.0f),
                    PathNode.CurveTo(164.0f, 109.90861f, 146.09138f, 92.0f, 124.0f, 92.0f),
                    PathNode.CurveTo(101.90861f, 92.0f, 84.0f, 109.90861f, 84.0f, 132.0f),
                    PathNode.CurveTo(84.0f, 154.09138f, 101.90861f, 172.0f, 124.0f, 172.0f),
                    PathNode.CurveTo(146.09138f, 172.0f, 164.0f, 154.09138f, 164.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
