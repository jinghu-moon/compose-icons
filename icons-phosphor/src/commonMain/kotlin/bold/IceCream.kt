package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorBoldIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 116.0f),
                    PathNode.CurveTo(227.96931f, 104.424484f, 221.71637f, 93.75969f, 211.63f, 88.08f),
                    PathNode.CurveTo(207.56654f, 44.92997f, 171.34094f, 11.955475f, 128.0f, 11.955475f),
                    PathNode.CurveTo(84.659065f, 11.955475f, 48.433456f, 44.92997f, 44.37f, 88.08f),
                    PathNode.CurveTo(32.168713f, 94.910286f, 25.815165f, 108.871765f, 28.679766f, 122.55819f),
                    PathNode.CurveTo(31.544367f, 136.24461f, 42.96367f, 146.48619f, 56.88f, 147.85f),
                    PathNode.LineTo(110.63f, 241.92f),
                    PathNode.CurveTo(114.18947f, 248.15656f, 120.81916f, 252.00621f, 128.0f, 252.00621f),
                    PathNode.CurveTo(135.18085f, 252.00621f, 141.81053f, 248.15656f, 145.37f, 241.92f),
                    PathNode.LineTo(199.12f, 147.85f),
                    PathNode.CurveTo(215.50722f, 146.2446f, 228.00127f, 132.46567f, 228.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(58.39f, 108.16f),
                    PathNode.CurveTo(63.98197f, 107.0235f, 68.0002f, 102.10629f, 68.0f, 96.4f),
                    PathNode.LineTo(68.0f, 96.0f),
                    PathNode.CurveTo(68.0f, 62.862915f, 94.862915f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(161.13708f, 36.0f, 188.0f, 62.862915f, 188.0f, 96.0f),
                    PathNode.LineTo(188.0f, 96.4f),
                    PathNode.CurveTo(187.9998f, 102.10629f, 192.01804f, 107.0235f, 197.61f, 108.16f),
                    PathNode.CurveTo(201.63974f, 108.97822f, 204.39291f, 112.71809f, 203.9771f, 116.80898f),
                    PathNode.CurveTo(203.56131f, 120.89988f, 200.11197f, 124.009315f, 196.0f, 124.0f),
                    PathNode.LineTo(60.0f, 124.0f),
                    PathNode.CurveTo(55.88804f, 124.009315f, 52.43869f, 120.89988f, 52.022884f, 116.80898f),
                    PathNode.CurveTo(51.607082f, 112.71809f, 54.360256f, 108.97822f, 58.39f, 108.16f),
                    PathNode.Close,
                    PathNode.MoveTo(171.39f, 148.0f),
                    PathNode.LineTo(154.89f, 176.88f),
                    PathNode.LineTo(138.39f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.61f, 148.0f),
                    PathNode.LineTo(110.75f, 148.0f),
                    PathNode.LineTo(141.07f, 201.06f),
                    PathNode.LineTo(128.0f, 223.94f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
