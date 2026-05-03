package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorThinIcon(
            name = "CurrencyKrw",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 132.0f),
                    PathNode.LineTo(211.94f, 132.0f),
                    PathNode.LineTo(235.71f, 73.51f),
                    PathNode.CurveTo(236.53842f, 71.46102f, 235.54898f, 69.128426f, 233.5f, 68.3f),
                    PathNode.CurveTo(231.45102f, 67.47157f, 229.11842f, 68.46102f, 228.29f, 70.51f),
                    PathNode.LineTo(203.29f, 132.02f),
                    PathNode.LineTo(156.69f, 132.02f),
                    PathNode.LineTo(131.69f, 70.51f),
                    PathNode.CurveTo(131.08f, 68.99651f, 129.6118f, 68.005295f, 127.98f, 68.005295f),
                    PathNode.CurveTo(126.348206f, 68.005295f, 124.880005f, 68.99651f, 124.27f, 70.51f),
                    PathNode.LineTo(99.31f, 132.0f),
                    PathNode.LineTo(52.69f, 132.0f),
                    PathNode.LineTo(27.69f, 70.49f),
                    PathNode.CurveTo(26.861572f, 68.441025f, 24.528976f, 67.45158f, 22.48f, 68.28f),
                    PathNode.CurveTo(20.431025f, 69.10843f, 19.441572f, 71.441025f, 20.27f, 73.49f),
                    PathNode.LineTo(44.06f, 132.0f),
                    PathNode.LineTo(16.0f, 132.0f),
                    PathNode.CurveTo(13.790861f, 132.0f, 12.0f, 133.79086f, 12.0f, 136.0f),
                    PathNode.CurveTo(12.0f, 138.20914f, 13.790861f, 140.0f, 16.0f, 140.0f),
                    PathNode.LineTo(47.31f, 140.0f),
                    PathNode.LineTo(72.31f, 201.51f),
                    PathNode.CurveTo(72.920006f, 203.02348f, 74.38821f, 204.01471f, 76.02f, 204.01471f),
                    PathNode.CurveTo(77.651794f, 204.01471f, 79.119995f, 203.02348f, 79.73f, 201.51f),
                    PathNode.LineTo(104.73f, 140.0f),
                    PathNode.LineTo(151.35f, 140.0f),
                    PathNode.LineTo(176.35f, 201.51f),
                    PathNode.CurveTo(176.96f, 203.02348f, 178.4282f, 204.01471f, 180.06f, 204.01471f),
                    PathNode.CurveTo(181.6918f, 204.01471f, 183.16f, 203.02348f, 183.77f, 201.51f),
                    PathNode.LineTo(208.77f, 140.0f),
                    PathNode.LineTo(240.0f, 140.0f),
                    PathNode.CurveTo(242.20914f, 140.0f, 244.0f, 138.20914f, 244.0f, 136.0f),
                    PathNode.CurveTo(244.0f, 133.79086f, 242.20914f, 132.0f, 240.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 189.37f),
                    PathNode.LineTo(55.94f, 140.0f),
                    PathNode.LineTo(96.06f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(107.94f, 132.0f),
                    PathNode.LineTo(128.0f, 82.63f),
                    PathNode.LineTo(148.06f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 189.37f),
                    PathNode.LineTo(159.94f, 140.0f),
                    PathNode.LineTo(200.06f, 140.0f),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
