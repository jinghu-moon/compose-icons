package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.QrCode: ImageVector
    get() {
        if (_qrCode != null) return _qrCode!!
        _qrCode = phosphorThinIcon(
            name = "QrCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 44.0f),
                    PathNode.LineTo(56.0f, 44.0f),
                    PathNode.CurveTo(49.37258f, 44.0f, 44.0f, 49.37258f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 110.62742f, 49.37258f, 116.0f, 56.0f, 116.0f),
                    PathNode.LineTo(104.0f, 116.0f),
                    PathNode.CurveTo(110.62742f, 116.0f, 116.0f, 110.62742f, 116.0f, 104.0f),
                    PathNode.LineTo(116.0f, 56.0f),
                    PathNode.CurveTo(116.0f, 49.37258f, 110.62742f, 44.0f, 104.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 104.0f),
                    PathNode.CurveTo(108.0f, 106.20914f, 106.20914f, 108.0f, 104.0f, 108.0f),
                    PathNode.LineTo(56.0f, 108.0f),
                    PathNode.CurveTo(53.79086f, 108.0f, 52.0f, 106.20914f, 52.0f, 104.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 53.79086f, 53.79086f, 52.0f, 56.0f, 52.0f),
                    PathNode.LineTo(104.0f, 52.0f),
                    PathNode.CurveTo(106.20914f, 52.0f, 108.0f, 53.79086f, 108.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 140.0f),
                    PathNode.LineTo(56.0f, 140.0f),
                    PathNode.CurveTo(49.37258f, 140.0f, 44.0f, 145.37259f, 44.0f, 152.0f),
                    PathNode.LineTo(44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 206.62741f, 49.37258f, 212.0f, 56.0f, 212.0f),
                    PathNode.LineTo(104.0f, 212.0f),
                    PathNode.CurveTo(110.62742f, 212.0f, 116.0f, 206.62741f, 116.0f, 200.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.CurveTo(116.0f, 145.37259f, 110.62742f, 140.0f, 104.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 200.0f),
                    PathNode.CurveTo(108.0f, 202.20914f, 106.20914f, 204.0f, 104.0f, 204.0f),
                    PathNode.LineTo(56.0f, 204.0f),
                    PathNode.CurveTo(53.79086f, 204.0f, 52.0f, 202.20914f, 52.0f, 200.0f),
                    PathNode.LineTo(52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 149.79086f, 53.79086f, 148.0f, 56.0f, 148.0f),
                    PathNode.LineTo(104.0f, 148.0f),
                    PathNode.CurveTo(106.20914f, 148.0f, 108.0f, 149.79086f, 108.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(145.37259f, 44.0f, 140.0f, 49.37258f, 140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 104.0f),
                    PathNode.CurveTo(140.0f, 110.62742f, 145.37259f, 116.0f, 152.0f, 116.0f),
                    PathNode.LineTo(200.0f, 116.0f),
                    PathNode.CurveTo(206.62741f, 116.0f, 212.0f, 110.62742f, 212.0f, 104.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 106.20914f, 202.20914f, 108.0f, 200.0f, 108.0f),
                    PathNode.LineTo(152.0f, 108.0f),
                    PathNode.CurveTo(149.79086f, 108.0f, 148.0f, 106.20914f, 148.0f, 104.0f),
                    PathNode.LineTo(148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 53.79086f, 149.79086f, 52.0f, 152.0f, 52.0f),
                    PathNode.LineTo(200.0f, 52.0f),
                    PathNode.CurveTo(202.20914f, 52.0f, 204.0f, 53.79086f, 204.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 144.0f),
                    PathNode.CurveTo(140.0f, 141.79086f, 141.79086f, 140.0f, 144.0f, 140.0f),
                    PathNode.CurveTo(146.20914f, 140.0f, 148.0f, 141.79086f, 148.0f, 144.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 178.20914f, 146.20914f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(141.79086f, 180.0f, 140.0f, 178.20914f, 140.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 160.0f),
                    PathNode.CurveTo(212.0f, 162.20914f, 210.20914f, 164.0f, 208.0f, 164.0f),
                    PathNode.LineTo(180.0f, 164.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(180.0f, 210.20914f, 178.20914f, 212.0f, 176.0f, 212.0f),
                    PathNode.LineTo(144.0f, 212.0f),
                    PathNode.CurveTo(141.79086f, 212.0f, 140.0f, 210.20914f, 140.0f, 208.0f),
                    PathNode.CurveTo(140.0f, 205.79086f, 141.79086f, 204.0f, 144.0f, 204.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 141.79086f, 173.79086f, 140.0f, 176.0f, 140.0f),
                    PathNode.CurveTo(178.20914f, 140.0f, 180.0f, 141.79086f, 180.0f, 144.0f),
                    PathNode.LineTo(180.0f, 156.0f),
                    PathNode.LineTo(208.0f, 156.0f),
                    PathNode.CurveTo(210.20914f, 156.0f, 212.0f, 157.79086f, 212.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.CurveTo(205.79086f, 212.0f, 204.0f, 210.20914f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 192.0f),
                    PathNode.CurveTo(204.0f, 189.79086f, 205.79086f, 188.0f, 208.0f, 188.0f),
                    PathNode.CurveTo(210.20914f, 188.0f, 212.0f, 189.79086f, 212.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
