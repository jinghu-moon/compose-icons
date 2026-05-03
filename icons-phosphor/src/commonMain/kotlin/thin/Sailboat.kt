package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorThinIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.61f, 174.27f),
                    PathNode.CurveTo(242.94395f, 172.8815f, 241.53998f, 171.99867f, 240.0f, 172.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(216.0f, 140.0f),
                    PathNode.CurveTo(217.59029f, 140.01582f, 219.03888f, 139.08803f, 219.68962f, 137.63689f),
                    PathNode.CurveTo(220.34035f, 136.18575f, 220.0696f, 134.48695f, 219.0f, 133.31f),
                    PathNode.LineTo(140.0f, 46.45f),
                    PathNode.LineTo(140.0f, 8.0f),
                    PathNode.CurveTo(139.99669f, 6.309541f, 138.93105f, 4.803669f, 137.33795f, 4.238233f),
                    PathNode.CurveTo(135.74486f, 3.672797f, 133.9683f, 4.169889f, 132.9f, 5.48f),
                    PathNode.LineTo(28.9f, 133.48f),
                    PathNode.CurveTo(27.928923f, 134.67703f, 27.732044f, 136.32553f, 28.393911f, 137.71759f),
                    PathNode.CurveTo(29.055777f, 139.10965f, 30.458612f, 139.99754f, 32.0f, 140.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(132.0f, 172.0f),
                    PathNode.LineTo(16.0f, 172.0f),
                    PathNode.CurveTo(14.462548f, 172.00096f, 13.061709f, 172.88303f, 12.396406f, 174.26907f),
                    PathNode.CurveTo(11.731103f, 175.65512f, 11.919092f, 177.29982f, 12.88f, 178.5f),
                    PathNode.LineTo(42.47f, 215.5f),
                    PathNode.CurveTo(44.7479f, 218.3451f, 48.195366f, 220.00076f, 51.84f, 220.0f),
                    PathNode.LineTo(204.16f, 220.0f),
                    PathNode.CurveTo(207.80464f, 220.00076f, 211.2521f, 218.3451f, 213.53f, 215.5f),
                    PathNode.LineTo(243.12f, 178.5f),
                    PathNode.CurveTo(244.08264f, 177.30133f, 244.27312f, 175.657f, 243.61f, 174.27f),
                    PathNode.Close,
                    PathNode.MoveTo(207.0f, 132.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.LineTo(140.0f, 58.35f),
                    PathNode.Close,
                    PathNode.MoveTo(40.4f, 132.0f),
                    PathNode.LineTo(132.0f, 19.27f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(207.28f, 210.5f),
                    PathNode.CurveTo(206.52142f, 211.44745f, 205.37372f, 211.99924f, 204.16f, 212.0f),
                    PathNode.LineTo(51.84f, 212.0f),
                    PathNode.CurveTo(50.62629f, 211.99924f, 49.47857f, 211.44745f, 48.72f, 210.5f),
                    PathNode.LineTo(24.32f, 180.0f),
                    PathNode.LineTo(231.68f, 180.0f),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
