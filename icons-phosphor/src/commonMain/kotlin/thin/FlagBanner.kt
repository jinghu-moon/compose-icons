package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlagBanner: ImageVector
    get() {
        if (_flagBanner != null) return _flagBanner!!
        _flagBanner = phosphorThinIcon(
            name = "FlagBanner",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.38f, 53.86f),
                    PathNode.CurveTo(234.64653f, 52.701733f, 233.37097f, 51.999798f, 232.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(38.381172f, 51.998726f, 36.92118f, 52.97331f, 36.30151f, 54.468838f),
                    PathNode.CurveTo(35.68184f, 55.96437f, 36.02468f, 57.685955f, 37.17f, 58.83f),
                    PathNode.LineTo(82.34f, 104.0f),
                    PathNode.LineTo(37.17f, 149.17f),
                    PathNode.CurveTo(36.02468f, 150.31404f, 35.68184f, 152.03563f, 36.30151f, 153.53116f),
                    PathNode.CurveTo(36.92118f, 155.02669f, 38.381172f, 156.00127f, 40.0f, 156.0f),
                    PathNode.LineTo(180.0f, 156.0f),
                    PathNode.LineTo(148.44f, 222.28f),
                    PathNode.CurveTo(147.49078f, 224.27379f, 148.33678f, 226.65958f, 150.33f, 227.61f),
                    PathNode.CurveTo(150.85106f, 227.86166f, 151.42137f, 227.99486f, 152.0f, 228.0f),
                    PathNode.CurveTo(153.54225f, 227.9995f, 154.94684f, 227.1124f, 155.61f, 225.72f),
                    PathNode.LineTo(235.61f, 57.72f),
                    PathNode.CurveTo(236.20166f, 56.479282f, 236.1148f, 55.02168f, 235.38f, 53.86f),
                    PathNode.Close,
                    PathNode.MoveTo(183.76f, 148.0f),
                    PathNode.LineTo(49.66f, 148.0f),
                    PathNode.LineTo(90.83f, 106.83f),
                    PathNode.CurveTo(91.581116f, 106.07973f, 92.00314f, 105.06164f, 92.00314f, 104.0f),
                    PathNode.CurveTo(92.00314f, 102.93836f, 91.581116f, 101.92027f, 90.83f, 101.17f),
                    PathNode.LineTo(49.66f, 60.0f),
                    PathNode.LineTo(225.66f, 60.0f),
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
        return _flagBanner!!
    }

private var _flagBanner: ImageVector? = null
