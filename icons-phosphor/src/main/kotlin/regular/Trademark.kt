package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = phosphorRegularIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 104.0f),
                    PathNode.CurveTo(112.0f, 108.41828f, 108.41828f, 112.0f, 104.0f, 112.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 156.41827f, 92.41828f, 160.0f, 88.0f, 160.0f),
                    PathNode.CurveTo(83.58172f, 160.0f, 80.0f, 156.41827f, 80.0f, 152.0f),
                    PathNode.LineTo(80.0f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(67.58172f, 112.0f, 64.0f, 108.41828f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 99.58172f, 67.58172f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(108.41828f, 96.0f, 112.0f, 99.58172f, 112.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(192.0f, 156.41827f, 188.41827f, 160.0f, 184.0f, 160.0f),
                    PathNode.CurveTo(179.58173f, 160.0f, 176.0f, 156.41827f, 176.0f, 152.0f),
                    PathNode.LineTo(176.0f, 125.29f),
                    PathNode.LineTo(162.0f, 141.29f),
                    PathNode.CurveTo(160.48134f, 143.01201f, 158.296f, 143.9985f, 156.0f, 143.9985f),
                    PathNode.CurveTo(153.704f, 143.9985f, 151.51866f, 143.01201f, 150.0f, 141.29f),
                    PathNode.LineTo(136.0f, 125.29f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(136.0f, 156.41827f, 132.41827f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(123.58172f, 160.0f, 120.0f, 156.41827f, 120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.00892f, 100.67677f, 122.07143f, 97.70512f, 125.18161f, 96.534355f),
                    PathNode.CurveTo(128.2918f, 95.363594f, 131.8019f, 96.23756f, 134.0f, 98.73f),
                    PathNode.LineTo(156.0f, 123.85f),
                    PathNode.LineTo(178.0f, 98.73f),
                    PathNode.CurveTo(180.1981f, 96.23756f, 183.7082f, 95.363594f, 186.81839f, 96.534355f),
                    PathNode.CurveTo(189.92857f, 97.70512f, 191.99109f, 100.67677f, 192.0f, 104.0f),
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
        return _trademark!!
    }

private var _trademark: ImageVector? = null
