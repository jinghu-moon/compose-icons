package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyGbp: ImageVector
    get() {
        if (_currencyGbp != null) return _currencyGbp!!
        _currencyGbp = phosphorFillIcon(
            name = "CurrencyGbp",
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
                    PathNode.MoveTo(168.0f, 184.0f),
                    PathNode.LineTo(88.0f, 184.0f),
                    PathNode.CurveTo(83.58172f, 184.0f, 80.0f, 180.41827f, 80.0f, 176.0f),
                    PathNode.CurveTo(80.0f, 171.58173f, 83.58172f, 168.0f, 88.0f, 168.0f),
                    PathNode.CurveTo(96.836555f, 168.0f, 104.0f, 160.83656f, 104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(83.58172f, 136.0f, 80.0f, 132.41827f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 123.58172f, 83.58172f, 120.0f, 88.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(104.00037f, 81.70956f, 111.624466f, 68.50481f, 124.00044f, 61.359745f),
                    PathNode.CurveTo(136.37642f, 54.214684f, 151.62411f, 54.21478f, 164.0f, 61.36f),
                    PathNode.CurveTo(167.69644f, 63.626984f, 168.91385f, 68.42618f, 166.745f, 72.18102f),
                    PathNode.CurveTo(164.57613f, 75.935875f, 159.81065f, 77.27924f, 156.0f, 75.21f),
                    PathNode.CurveTo(148.57355f, 70.92233f, 139.42365f, 70.92284f, 131.99767f, 75.21135f),
                    PathNode.CurveTo(124.571686f, 79.49985f, 119.99808f, 87.42466f, 120.0f, 96.0f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(140.41827f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 132.41827f, 140.41827f, 136.0f, 136.0f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.CurveTo(120.00685f, 157.62106f, 118.519394f, 163.14294f, 115.69f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(172.41827f, 168.0f, 176.0f, 171.58173f, 176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 180.41827f, 172.41827f, 184.0f, 168.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _currencyGbp!!
    }

private var _currencyGbp: ImageVector? = null
