package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorThinIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.58f, 214.21f),
                    PathNode.LineTo(187.58f, 102.21f),
                    PathNode.CurveTo(186.90335f, 100.85234f, 185.51694f, 99.99426f, 184.0f, 99.99426f),
                    PathNode.CurveTo(182.48306f, 99.99426f, 181.09665f, 100.85234f, 180.42f, 102.21f),
                    PathNode.LineTo(157.55f, 148.0f),
                    PathNode.CurveTo(137.2644f, 147.43144f, 117.73527f, 140.17525f, 102.0f, 127.36f),
                    PathNode.CurveTo(120.20953f, 109.55244f, 130.9118f, 85.44996f, 131.91f, 60.0f),
                    PathNode.LineTo(160.0f, 60.0f),
                    PathNode.CurveTo(162.20914f, 60.0f, 164.0f, 58.20914f, 164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 53.79086f, 162.20914f, 52.0f, 160.0f, 52.0f),
                    PathNode.LineTo(100.0f, 52.0f),
                    PathNode.LineTo(100.0f, 32.0f),
                    PathNode.CurveTo(100.0f, 29.790861f, 98.20914f, 28.0f, 96.0f, 28.0f),
                    PathNode.CurveTo(93.79086f, 28.0f, 92.0f, 29.790861f, 92.0f, 32.0f),
                    PathNode.LineTo(92.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(29.790861f, 52.0f, 28.0f, 53.79086f, 28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 58.20914f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(123.91f, 60.0f),
                    PathNode.CurveTo(122.89779f, 83.49471f, 112.90762f, 105.705025f, 96.0f, 122.05f),
                    PathNode.CurveTo(85.779f, 112.17384f, 77.98521f, 100.06386f, 73.23f, 86.67f),
                    PathNode.CurveTo(72.79061f, 85.276375f, 71.62625f, 84.23325f, 70.19289f, 83.94912f),
                    PathNode.CurveTo(68.75953f, 83.66499f, 67.28529f, 84.18508f, 66.34752f, 85.30571f),
                    PathNode.CurveTo(65.40974f, 86.426346f, 65.15766f, 87.96917f, 65.69f, 89.33f),
                    PathNode.CurveTo(70.77722f, 103.6884f, 79.090416f, 116.68845f, 89.99f, 127.33f),
                    PathNode.CurveTo(73.62401f, 140.7047f, 53.135944f, 148.00748f, 32.0f, 148.0f),
                    PathNode.CurveTo(29.790861f, 148.0f, 28.0f, 149.79086f, 28.0f, 152.0f),
                    PathNode.CurveTo(28.0f, 154.20914f, 29.790861f, 156.0f, 32.0f, 156.0f),
                    PathNode.CurveTo(55.398186f, 156.02582f, 78.05763f, 147.80823f, 96.0f, 132.79f),
                    PathNode.CurveTo(112.29665f, 146.37387f, 132.48814f, 154.42805f, 153.66f, 155.79f),
                    PathNode.LineTo(124.44f, 214.22f),
                    PathNode.CurveTo(123.45141f, 216.19717f, 124.25282f, 218.60141f, 126.23f, 219.59f),
                    PathNode.CurveTo(128.20718f, 220.57858f, 130.6114f, 219.77716f, 131.6f, 217.8f),
                    PathNode.LineTo(146.47f, 188.0f),
                    PathNode.LineTo(221.53f, 188.0f),
                    PathNode.LineTo(236.42f, 217.79f),
                    PathNode.CurveTo(237.09825f, 219.14543f, 238.48434f, 220.00108f, 240.0f, 220.0f),
                    PathNode.CurveTo(240.62068f, 219.99663f, 241.23259f, 219.85304f, 241.79f, 219.58f),
                    PathNode.CurveTo(242.73994f, 219.10577f, 243.46242f, 218.27333f, 243.79817f, 217.26605f),
                    PathNode.CurveTo(244.13393f, 216.25879f, 244.05544f, 215.15936f, 243.58f, 214.21f),
                    PathNode.Close,
                    PathNode.MoveTo(150.47f, 180.0f),
                    PathNode.LineTo(184.0f, 112.94f),
                    PathNode.LineTo(217.53f, 180.0f),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
