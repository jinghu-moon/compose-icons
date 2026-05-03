package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorThinIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 84.0f),
                    PathNode.CurveTo(205.79086f, 84.0f, 204.0f, 85.79086f, 204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 108.0f),
                    PathNode.LineTo(185.23f, 108.0f),
                    PathNode.LineTo(180.0f, 55.6f),
                    PathNode.CurveTo(179.89758f, 54.595245f, 179.41888f, 53.66642f, 178.66f, 53.0f),
                    PathNode.LineTo(135.78f, 14.87f),
                    PathNode.LineTo(135.68f, 14.78f),
                    PathNode.CurveTo(131.23062f, 11.073998f, 124.76937f, 11.073998f, 120.32f, 14.78f),
                    PathNode.LineTo(120.22f, 14.87f),
                    PathNode.LineTo(77.34f, 53.0f),
                    PathNode.CurveTo(76.581116f, 53.66642f, 76.10241f, 54.595245f, 76.0f, 55.6f),
                    PathNode.LineTo(70.77f, 108.0f),
                    PathNode.LineTo(52.0f, 108.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(52.0f, 85.79086f, 50.20914f, 84.0f, 48.0f, 84.0f),
                    PathNode.CurveTo(45.79086f, 84.0f, 44.0f, 85.79086f, 44.0f, 88.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 114.20914f, 45.79086f, 116.0f, 48.0f, 116.0f),
                    PathNode.LineTo(70.0f, 116.0f),
                    PathNode.LineTo(60.08f, 214.86f),
                    PathNode.CurveTo(59.75923f, 218.22115f, 60.86931f, 221.56192f, 63.13788f, 224.06267f),
                    PathNode.CurveTo(65.40645f, 226.56343f, 68.62359f, 227.99277f, 72.0f, 228.0f),
                    PathNode.LineTo(184.0f, 228.0f),
                    PathNode.CurveTo(187.38373f, 227.99893f, 190.60974f, 226.56932f, 192.88342f, 224.06332f),
                    PathNode.CurveTo(195.15709f, 221.55734f, 196.26709f, 218.20789f, 195.94f, 214.84f),
                    PathNode.LineTo(186.0f, 116.0f),
                    PathNode.LineTo(208.0f, 116.0f),
                    PathNode.CurveTo(210.20914f, 116.0f, 212.0f, 114.20914f, 212.0f, 112.0f),
                    PathNode.LineTo(212.0f, 88.0f),
                    PathNode.CurveTo(212.0f, 85.79086f, 210.20914f, 84.0f, 208.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(125.48f, 20.89f),
                    PathNode.CurveTo(126.94133f, 19.72f, 129.01866f, 19.72f, 130.48f, 20.89f),
                    PathNode.LineTo(165.48f, 52.0f),
                    PathNode.LineTo(90.48f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.62f, 60.0f),
                    PathNode.LineTo(172.38f, 60.0f),
                    PathNode.LineTo(177.19f, 108.0f),
                    PathNode.LineTo(132.0f, 108.0f),
                    PathNode.LineTo(132.0f, 88.0f),
                    PathNode.CurveTo(132.0f, 85.79086f, 130.20914f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(125.79086f, 84.0f, 124.0f, 85.79086f, 124.0f, 88.0f),
                    PathNode.LineTo(124.0f, 108.0f),
                    PathNode.LineTo(78.81f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.0f, 218.69f),
                    PathNode.CurveTo(186.2373f, 219.54109f, 185.14267f, 220.01909f, 184.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(70.87371f, 220.00458f, 69.79768f, 219.5341f, 69.03627f, 218.70416f),
                    PathNode.CurveTo(68.27486f, 217.87422f, 67.89862f, 216.76173f, 68.0f, 215.64f),
                    PathNode.LineTo(72.39f, 172.0f),
                    PathNode.LineTo(183.61f, 172.0f),
                    PathNode.LineTo(188.0f, 215.62f),
                    PathNode.CurveTo(188.12184f, 216.73933f, 187.75772f, 217.85716f, 187.0f, 218.69f),
                    PathNode.Close,
                    PathNode.MoveTo(182.81f, 164.0f),
                    PathNode.LineTo(73.19f, 164.0f),
                    PathNode.LineTo(78.0f, 116.0f),
                    PathNode.LineTo(178.0f, 116.0f),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
