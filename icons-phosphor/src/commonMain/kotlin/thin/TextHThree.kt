package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextHThree: ImageVector
    get() {
        if (_textHThree != null) return _textHThree!!
        _textHThree = phosphorThinIcon(
            name = "TextHThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 180.0f),
                    PathNode.CurveTo(244.00308f, 193.00438f, 236.13593f, 204.71732f, 224.09648f, 209.63316f),
                    PathNode.CurveTo(212.05704f, 214.54901f, 198.23997f, 211.69f, 189.14f, 202.4f),
                    PathNode.CurveTo(187.5936f, 200.82047f, 187.62047f, 198.2864f, 189.2f, 196.74f),
                    PathNode.CurveTo(190.77954f, 195.1936f, 193.3136f, 195.22046f, 194.86f, 196.8f),
                    PathNode.CurveTo(202.48456f, 204.5786f, 214.39134f, 206.24727f, 223.86043f, 200.86424f),
                    PathNode.CurveTo(233.3295f, 195.48123f, 237.98618f, 184.39648f, 235.20232f, 173.86603f),
                    PathNode.CurveTo(232.41849f, 163.33557f, 222.89221f, 156.00026f, 212.0f, 156.0f),
                    PathNode.CurveTo(210.50928f, 156.00014f, 209.14215f, 155.1713f, 208.45288f, 153.84949f),
                    PathNode.CurveTo(207.76361f, 152.5277f, 207.86656f, 150.93225f, 208.72f, 149.71f),
                    PathNode.LineTo(232.32f, 116.0f),
                    PathNode.LineTo(192.0f, 116.0f),
                    PathNode.CurveTo(189.79086f, 116.0f, 188.0f, 114.20914f, 188.0f, 112.0f),
                    PathNode.CurveTo(188.0f, 109.79086f, 189.79086f, 108.0f, 192.0f, 108.0f),
                    PathNode.LineTo(240.0f, 108.0f),
                    PathNode.CurveTo(241.49072f, 107.999855f, 242.85785f, 108.828705f, 243.54712f, 110.150505f),
                    PathNode.CurveTo(244.23639f, 111.47231f, 244.13344f, 113.06775f, 243.28f, 114.29f),
                    PathNode.LineTo(219.12f, 148.8f),
                    PathNode.CurveTo(233.66394f, 152.14206f, 243.97874f, 165.07703f, 244.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 52.0f),
                    PathNode.CurveTo(141.79086f, 52.0f, 140.0f, 53.79086f, 140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 112.0f),
                    PathNode.LineTo(44.0f, 112.0f),
                    PathNode.LineTo(44.0f, 56.0f),
                    PathNode.CurveTo(44.0f, 53.79086f, 42.20914f, 52.0f, 40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 178.20914f, 37.79086f, 180.0f, 40.0f, 180.0f),
                    PathNode.CurveTo(42.20914f, 180.0f, 44.0f, 178.20914f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 120.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 178.20914f, 141.79086f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(146.20914f, 180.0f, 148.0f, 178.20914f, 148.0f, 176.0f),
                    PathNode.LineTo(148.0f, 56.0f),
                    PathNode.CurveTo(148.0f, 53.79086f, 146.20914f, 52.0f, 144.0f, 52.0f),
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
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
