package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorRegularIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 168.0f),
                    PathNode.LineTo(248.0f, 200.0f),
                    PathNode.CurveTo(248.0f, 204.41827f, 244.41827f, 208.0f, 240.0f, 208.0f),
                    PathNode.CurveTo(235.58173f, 208.0f, 232.0f, 204.41827f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 187.31f),
                    PathNode.LineTo(229.79f, 189.53f),
                    PathNode.CurveTo(226.69f, 192.9f, 189.44f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(65.16f, 232.0f, 27.62f, 191.09f, 26.05f, 189.35f),
                    PathNode.CurveTo(23.095276f, 186.0501f, 23.3751f, 180.97972f, 26.675f, 178.025f),
                    PathNode.CurveTo(29.974901f, 175.07028f, 35.045277f, 175.3501f, 38.0f, 178.65f),
                    PathNode.CurveTo(38.27f, 179.0f, 72.5f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(183.5f, 216.0f, 217.73f, 179.0f, 218.07f, 178.64f),
                    PathNode.CurveTo(218.1547f, 178.53535f, 218.24481f, 178.43521f, 218.34f, 178.34f),
                    PathNode.LineTo(220.69f, 176.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(203.58173f, 176.0f, 200.0f, 172.41827f, 200.0f, 168.0f),
                    PathNode.CurveTo(200.0f, 163.58173f, 203.58173f, 160.0f, 208.0f, 160.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(244.41827f, 160.0f, 248.0f, 163.58173f, 248.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 94.53f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(160.01099f, 67.34907f, 148.60158f, 52.863293f, 132.41154f, 48.972736f),
                    PathNode.CurveTo(116.22151f, 45.08218f, 99.47594f, 52.802162f, 91.92f, 67.64f),
                    PathNode.CurveTo(89.90968f, 71.57503f, 85.09003f, 73.135315f, 81.155f, 71.125f),
                    PathNode.CurveTo(77.21997f, 69.114685f, 75.65968f, 64.29503f, 77.67f, 60.36f),
                    PathNode.CurveTo(88.5892f, 38.93508f, 112.77448f, 27.791624f, 136.15524f, 33.41271f),
                    PathNode.CurveTo(159.536f, 39.03379f, 176.01291f, 59.953045f, 176.0f, 84.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 180.41827f, 172.41827f, 184.0f, 168.0f, 184.0f),
                    PathNode.CurveTo(163.58173f, 184.0f, 160.0f, 180.41827f, 160.0f, 176.0f),
                    PathNode.LineTo(160.0f, 169.47f),
                    PathNode.CurveTo(139.49329f, 189.20258f, 106.93386f, 188.78502f, 86.93994f, 168.53304f),
                    PathNode.CurveTo(66.94602f, 148.28105f, 66.94602f, 115.71895f, 86.93994f, 95.466965f),
                    PathNode.CurveTo(106.93386f, 75.21499f, 139.49329f, 74.797424f, 160.0f, 94.53f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 132.0f),
                    PathNode.CurveTo(160.0f, 112.11775f, 143.88223f, 96.0f, 124.0f, 96.0f),
                    PathNode.CurveTo(104.11775f, 96.0f, 88.0f, 112.11775f, 88.0f, 132.0f),
                    PathNode.CurveTo(88.0f, 151.88223f, 104.11775f, 168.0f, 124.0f, 168.0f),
                    PathNode.CurveTo(143.88223f, 168.0f, 160.0f, 151.88223f, 160.0f, 132.0f),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
