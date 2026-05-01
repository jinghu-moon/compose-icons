package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorThinIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 112.0f),
                    PathNode.CurveTo(164.00964f, 94.97504f, 152.0917f, 80.27095f, 135.43364f, 76.75547f),
                    PathNode.CurveTo(118.77559f, 73.23998f, 101.93235f, 81.87436f, 95.06172f, 97.45139f),
                    PathNode.CurveTo(88.19109f, 113.02843f, 93.17177f, 131.28877f, 107.0f, 141.22f),
                    PathNode.LineTo(92.34f, 174.39f),
                    PathNode.CurveTo(91.79626f, 175.62663f, 91.91346f, 177.0542f, 92.6516f, 178.18562f),
                    PathNode.CurveTo(93.38973f, 179.31702f, 94.64909f, 179.99944f, 96.0f, 180.0f),
                    PathNode.LineTo(160.0f, 180.0f),
                    PathNode.CurveTo(161.3509f, 179.99944f, 162.61026f, 179.31702f, 163.3484f, 178.18562f),
                    PathNode.CurveTo(164.08655f, 177.0542f, 164.20374f, 175.62663f, 163.66f, 174.39f),
                    PathNode.LineTo(149.0f, 141.22f),
                    PathNode.CurveTo(158.39159f, 134.4448f, 163.96883f, 123.580345f, 164.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.34f, 141.33f),
                    PathNode.LineTo(153.86f, 172.0f),
                    PathNode.LineTo(102.14f, 172.0f),
                    PathNode.LineTo(115.66f, 141.33f),
                    PathNode.CurveTo(116.47899f, 139.46388f, 115.76408f, 137.28038f, 114.0f, 136.26f),
                    PathNode.CurveTo(103.024895f, 129.92352f, 97.67407f, 117.00549f, 100.95408f, 104.76436f),
                    PathNode.CurveTo(104.23408f, 92.52322f, 115.32704f, 84.01129f, 128.0f, 84.01129f),
                    PathNode.CurveTo(140.67296f, 84.01129f, 151.76591f, 92.52322f, 155.04593f, 104.76436f),
                    PathNode.CurveTo(158.32591f, 117.00549f, 152.9751f, 129.92352f, 142.0f, 136.26f),
                    PathNode.CurveTo(140.23593f, 137.28038f, 139.52101f, 139.46388f, 140.34f, 141.33f),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
