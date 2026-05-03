package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorThinIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.35f, 178.0f),
                    PathNode.CurveTo(212.58f, 168.0f, 204.0f, 140.13f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.0f, 62.02636f, 169.97365f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(86.02636f, 28.0f, 52.0f, 62.02636f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 140.13f, 43.41f, 168.0f, 37.64f, 177.95f),
                    PathNode.CurveTo(35.47363f, 181.66086f, 35.456745f, 186.24683f, 37.595734f, 189.97353f),
                    PathNode.CurveTo(39.73472f, 193.70024f, 43.703068f, 195.99883f, 48.0f, 196.0f),
                    PathNode.LineTo(92.23f, 196.0f),
                    PathNode.CurveTo(94.296455f, 214.19322f, 109.68981f, 227.9371f, 128.0f, 227.9371f),
                    PathNode.CurveTo(146.3102f, 227.9371f, 161.70355f, 214.19322f, 163.77f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(212.27963f, 195.98492f, 216.22733f, 193.69179f, 218.36061f, 189.98174f),
                    PathNode.CurveTo(220.4939f, 186.27167f, 220.48985f, 181.70627f, 218.35f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(114.08228f, 219.9986f, 102.27825f, 209.77498f, 100.29f, 196.0f),
                    PathNode.LineTo(155.71f, 196.0f),
                    PathNode.CurveTo(153.72176f, 209.77498f, 141.91772f, 219.9986f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.45f, 186.0f),
                    PathNode.CurveTo(210.75366f, 187.2439f, 209.43552f, 188.01028f, 208.01f, 188.0f),
                    PathNode.LineTo(48.0f, 188.0f),
                    PathNode.CurveTo(46.57448f, 188.01028f, 45.256336f, 187.2439f, 44.56f, 186.0f),
                    PathNode.CurveTo(43.84547f, 184.76239f, 43.84547f, 183.23761f, 44.56f, 182.0f),
                    PathNode.CurveTo(52.0f, 169.17f, 60.0f, 139.32f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 66.44463f, 90.44463f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(165.55536f, 36.0f, 196.0f, 66.44463f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 139.31f, 204.0f, 169.17f, 211.44f, 182.0f),
                    PathNode.CurveTo(212.15762f, 183.23582f, 212.16144f, 184.7606f, 211.45f, 186.0f),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
