package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorThinIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.0f, 51.15f),
                    PathNode.CurveTo(225.10751f, 46.769176f, 220.77187f, 43.951008f, 216.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(35.25091f, 44.00046f, 30.948883f, 46.80163f, 29.027325f, 51.144608f),
                    PathNode.CurveTo(27.105768f, 55.487587f, 27.926237f, 60.55521f, 31.12f, 64.07f),
                    PathNode.LineTo(31.17f, 64.12f),
                    PathNode.LineTo(100.0f, 137.59f),
                    PathNode.LineTo(100.0f, 216.0f),
                    PathNode.CurveTo(99.99343f, 220.42952f, 102.427536f, 224.50243f, 106.33176f, 226.59473f),
                    PathNode.CurveTo(110.23598f, 228.68701f, 114.97531f, 228.45839f, 118.66f, 226.0f),
                    PathNode.LineTo(150.66f, 204.67f),
                    PathNode.CurveTo(154.00537f, 202.44284f, 156.01373f, 198.68889f, 156.01f, 194.67f),
                    PathNode.LineTo(156.01f, 137.59f),
                    PathNode.LineTo(224.87f, 64.07f),
                    PathNode.CurveTo(228.11105f, 60.5823f, 228.95f, 55.4935f, 227.0f, 51.15f),
                    PathNode.Close,
                    PathNode.MoveTo(219.0f, 58.65f),
                    PathNode.LineTo(149.1f, 133.27f),
                    PathNode.CurveTo(148.39969f, 134.00713f, 148.00638f, 134.98328f, 148.0f, 136.0f),
                    PathNode.LineTo(148.0f, 194.65f),
                    PathNode.CurveTo(148.00087f, 195.98782f, 147.33287f, 197.2375f, 146.22f, 197.98f),
                    PathNode.LineTo(114.22f, 219.31f),
                    PathNode.CurveTo(112.99525f, 220.12715f, 111.4206f, 220.20543f, 110.12085f, 219.51376f),
                    PathNode.CurveTo(108.8211f, 218.8221f, 108.00639f, 217.47232f, 108.0f, 216.0f),
                    PathNode.LineTo(108.0f, 136.0f),
                    PathNode.CurveTo(108.00158f, 134.98254f, 107.61537f, 134.00273f, 106.92f, 133.26f),
                    PathNode.LineTo(37.05f, 58.67f),
                    PathNode.CurveTo(35.999916f, 57.498688f, 35.733875f, 55.820637f, 36.37017f, 54.38196f),
                    PathNode.CurveTo(37.006462f, 52.94329f, 38.426937f, 52.01115f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(217.57404f, 51.998524f, 219.00262f, 52.920322f, 219.6499f, 54.35512f),
                    PathNode.CurveTo(220.29718f, 55.789917f, 220.0428f, 57.470943f, 219.0f, 58.65f),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
