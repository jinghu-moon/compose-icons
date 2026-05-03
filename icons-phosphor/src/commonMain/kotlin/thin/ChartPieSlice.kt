package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorThinIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 109.5f),
                    PathNode.LineTo(100.0f, 37.5f),
                    PathNode.CurveTo(99.999214f, 36.20251f, 99.36915f, 34.986004f, 98.30986f, 34.23675f),
                    PathNode.CurveTo(97.25057f, 33.487495f, 95.89367f, 33.298584f, 94.67f, 33.73f),
                    PathNode.CurveTo(48.274807f, 50.12953f, 20.705835f, 97.84506f, 29.67f, 146.23f),
                    PathNode.CurveTo(29.897612f, 147.51251f, 30.735432f, 148.60387f, 31.915577f, 149.15514f),
                    PathNode.CurveTo(33.095722f, 149.7064f, 34.470375f, 149.64851f, 35.6f, 149.0f),
                    PathNode.LineTo(98.0f, 113.0f),
                    PathNode.CurveTo(99.24878f, 112.27909f, 100.01291f, 110.94187f, 100.0f, 109.5f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 107.19f),
                    PathNode.LineTo(36.67f, 139.11f),
                    PathNode.CurveTo(31.723099f, 98.42613f, 54.283943f, 59.375847f, 92.0f, 43.34f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(125.79086f, 28.0f, 124.0f, 29.790861f, 124.0f, 32.0f),
                    PathNode.LineTo(124.0f, 126.12f),
                    PathNode.LineTo(43.2f, 173.18f),
                    PathNode.CurveTo(42.279984f, 173.71622f, 41.611748f, 174.59714f, 41.343334f, 175.62762f),
                    PathNode.CurveTo(41.074917f, 176.65811f, 41.22848f, 177.7531f, 41.77f, 178.67f),
                    PathNode.CurveTo(66.30927f, 220.42223f, 117.24032f, 238.5895f, 162.664f, 221.79326f),
                    PathNode.CurveTo(208.08769f, 204.99702f, 234.9472f, 158.06529f, 226.41989f, 110.39236f),
                    PathNode.CurveTo(217.89258f, 62.719406f, 176.42958f, 28.0086f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(96.8259f, 219.91154f, 67.79472f, 204.12148f, 50.78f, 178.0f),
                    PathNode.LineTo(130.0f, 131.88f),
                    PathNode.CurveTo(131.23634f, 131.1662f, 131.99854f, 129.8476f, 132.0f, 128.42f),
                    PathNode.LineTo(132.0f, 36.09f),
                    PathNode.CurveTo(181.95538f, 38.30097f, 220.99773f, 80.00809f, 219.91042f, 130.00053f),
                    PathNode.CurveTo(218.82309f, 179.99297f, 178.00426f, 219.96313f, 128.0f, 220.0f),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
