package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorFillIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 48.0f),
                    PathNode.CurveTo(120.0f, 30.326887f, 134.32689f, 16.0f, 152.0f, 16.0f),
                    PathNode.CurveTo(169.67311f, 16.0f, 184.0f, 30.326887f, 184.0f, 48.0f),
                    PathNode.CurveTo(184.0f, 65.67311f, 169.67311f, 80.0f, 152.0f, 80.0f),
                    PathNode.CurveTo(134.32689f, 80.0f, 120.0f, 65.67311f, 120.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 136.0f),
                    PathNode.CurveTo(168.63f, 136.0f, 163.08f, 127.44f, 155.4f, 115.6f),
                    PathNode.CurveTo(151.75f, 109.96f, 147.61f, 103.6f, 141.24f, 98.05f),
                    PathNode.CurveTo(138.79942f, 95.91621f, 136.11392f, 94.08f, 133.24f, 92.58f),
                    PathNode.CurveTo(131.27318f, 91.566605f, 128.97449f, 91.41301f, 126.890335f, 92.15573f),
                    PathNode.CurveTo(124.806175f, 92.898445f, 123.12267f, 94.471146f, 122.24f, 96.5f),
                    PathNode.LineTo(64.66f, 228.81f),
                    PathNode.CurveTo(62.902973f, 232.86104f, 64.76043f, 237.56958f, 68.81f, 239.33f),
                    PathNode.CurveTo(69.81465f, 239.77435f, 70.90147f, 240.00262f, 72.0f, 240.0f),
                    PathNode.CurveTo(75.18622f, 240.0014f, 78.069496f, 238.11195f, 79.34f, 235.19f),
                    PathNode.LineTo(112.93f, 157.92f),
                    PathNode.LineTo(144.0f, 180.12f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.CurveTo(144.0f, 236.41827f, 147.58173f, 240.0f, 152.0f, 240.0f),
                    PathNode.CurveTo(156.41827f, 240.0f, 160.0f, 236.41827f, 160.0f, 232.0f),
                    PathNode.LineTo(160.0f, 176.0f),
                    PathNode.CurveTo(160.00006f, 173.41637f, 158.75237f, 170.99174f, 156.65f, 169.49f),
                    PathNode.LineTo(119.45f, 142.92f),
                    PathNode.LineTo(132.85f, 112.11f),
                    PathNode.CurveTo(136.42f, 115.73f, 139.13f, 119.91f, 141.98f, 124.3f),
                    PathNode.CurveTo(149.65f, 136.14f, 158.25f, 149.41f, 183.98f, 151.66f),
                    PathNode.LineTo(183.98f, 232.0f),
                    PathNode.CurveTo(183.98f, 236.41827f, 187.56172f, 240.0f, 191.98f, 240.0f),
                    PathNode.CurveTo(196.39828f, 240.0f, 199.98f, 236.41827f, 199.98f, 232.0f),
                    PathNode.LineTo(199.98f, 144.0f),
                    PathNode.CurveTo(199.98001f, 139.58952f, 196.41046f, 136.01105f, 192.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 152.0f),
                    PathNode.CurveTo(75.20303f, 152.0025f, 78.09881f, 150.09428f, 79.36f, 147.15f),
                    PathNode.LineTo(103.36f, 91.15f),
                    PathNode.CurveTo(105.09764f, 87.09068f, 103.21782f, 82.39113f, 99.16f, 80.65f),
                    PathNode.LineTo(71.16f, 68.65f),
                    PathNode.CurveTo(67.100685f, 66.91235f, 62.40113f, 68.792175f, 60.66f, 72.85f),
                    PathNode.LineTo(36.66f, 128.85f),
                    PathNode.CurveTo(34.922356f, 132.90932f, 36.802177f, 137.60887f, 40.86f, 139.35f),
                    PathNode.LineTo(68.86f, 151.35f),
                    PathNode.CurveTo(69.85207f, 151.77635f, 70.92019f, 151.99747f, 72.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
