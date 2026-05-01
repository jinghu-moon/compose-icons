package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassSimpleLow: ImageVector
    get() {
        if (_hourglassSimpleLow != null) return _hourglassSimpleLow!!
        _hourglassSimpleLow = phosphorDuotoneIcon(
            name = "HourglassSimpleLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.CurveTo(52.76235f, 216.00255f, 49.84236f, 214.05338f, 48.60302f, 211.06232f),
                    PathNode.CurveTo(47.363674f, 208.07126f, 48.04936f, 204.6281f, 50.34f, 202.34f),
                    PathNode.LineTo(77.87f, 176.0f),
                    PathNode.LineTo(178.13f, 176.0f),
                    PathNode.LineTo(205.64f, 202.34f),
                    PathNode.CurveTo(207.92807f, 204.62552f, 208.61502f, 208.06384f, 207.38081f, 211.05309f),
                    PathNode.CurveTo(206.14659f, 214.04231f, 203.23401f, 215.99446f, 200.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.18f, 196.56f),
                    PathNode.LineTo(139.57f, 128.0f),
                    PathNode.LineTo(211.18f, 59.44f),
                    PathNode.CurveTo(211.2208f, 59.394196f, 211.26419f, 59.35079f, 211.31f, 59.31f),
                    PathNode.CurveTo(215.88284f, 54.73416f, 217.25029f, 47.854897f, 214.77507f, 41.878067f),
                    PathNode.CurveTo(212.29987f, 35.901237f, 206.46909f, 32.003f, 200.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(49.530907f, 32.003f, 43.700134f, 35.901237f, 41.224922f, 41.878067f),
                    PathNode.CurveTo(38.749718f, 47.854897f, 40.11716f, 54.73416f, 44.69f, 59.31f),
                    PathNode.CurveTo(44.735806f, 59.35079f, 44.77921f, 59.394196f, 44.82f, 59.44f),
                    PathNode.LineTo(116.43f, 128.0f),
                    PathNode.LineTo(44.82f, 196.56f),
                    PathNode.CurveTo(44.77921f, 196.6058f, 44.735806f, 196.64922f, 44.69f, 196.69f),
                    PathNode.CurveTo(40.11716f, 201.26584f, 38.749718f, 208.14508f, 41.224922f, 214.12193f),
                    PathNode.CurveTo(43.700134f, 220.09877f, 49.530907f, 223.99701f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(206.47092f, 224.00104f, 212.30539f, 220.1043f, 214.78316f, 214.12656f),
                    PathNode.CurveTo(217.26093f, 208.14882f, 215.89412f, 201.26712f, 211.32f, 196.69f),
                    PathNode.CurveTo(211.27077f, 196.6495f, 211.22401f, 196.6061f, 211.18f, 196.56f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.21f, 168.0f),
                    PathNode.LineTo(97.79f, 168.0f),
                    PathNode.LineTo(128.0f, 139.08f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(128.0f, 116.92f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 208.0f),
                    PathNode.LineTo(81.06f, 184.0f),
                    PathNode.LineTo(174.9f, 184.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hourglassSimpleLow!!
    }

private var _hourglassSimpleLow: ImageVector? = null
