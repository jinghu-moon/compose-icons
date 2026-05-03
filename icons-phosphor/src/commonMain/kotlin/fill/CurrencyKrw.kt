package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CurrencyKrw: ImageVector
    get() {
        if (_currencyKrw != null) return _currencyKrw!!
        _currencyKrw = phosphorFillIcon(
            name = "CurrencyKrw",
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
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.LineTo(181.42f, 144.0f),
                    PathNode.LineTo(167.42f, 179.0f),
                    PathNode.CurveTo(166.20653f, 182.04016f, 163.26338f, 184.03435f, 159.99f, 184.03435f),
                    PathNode.CurveTo(156.71661f, 184.03435f, 153.77347f, 182.04016f, 152.56f, 179.0f),
                    PathNode.LineTo(128.0f, 117.54f),
                    PathNode.LineTo(103.43f, 179.0f),
                    PathNode.CurveTo(102.21654f, 182.04016f, 99.273384f, 184.03435f, 96.0f, 184.03435f),
                    PathNode.CurveTo(92.726616f, 184.03435f, 89.78346f, 182.04016f, 88.57f, 179.0f),
                    PathNode.LineTo(74.57f, 144.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(51.581722f, 144.0f, 48.0f, 140.41827f, 48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 131.58173f, 51.581722f, 128.0f, 56.0f, 128.0f),
                    PathNode.LineTo(68.18f, 128.0f),
                    PathNode.LineTo(56.57f, 99.0f),
                    PathNode.CurveTo(54.913147f, 94.89652f, 56.896523f, 90.22685f, 61.0f, 88.57f),
                    PathNode.CurveTo(65.10348f, 86.91315f, 69.77315f, 88.89652f, 71.43f, 93.0f),
                    PathNode.LineTo(96.0f, 154.46f),
                    PathNode.LineTo(120.57f, 93.0f),
                    PathNode.CurveTo(121.78346f, 89.95985f, 124.726616f, 87.96565f, 128.0f, 87.96565f),
                    PathNode.CurveTo(131.27339f, 87.96565f, 134.21654f, 89.95985f, 135.43f, 93.0f),
                    PathNode.LineTo(160.0f, 154.46f),
                    PathNode.LineTo(184.57f, 93.0f),
                    PathNode.CurveTo(186.22685f, 88.89652f, 190.89653f, 86.91315f, 195.0f, 88.57f),
                    PathNode.CurveTo(199.10347f, 90.22685f, 201.08685f, 94.89652f, 199.43f, 99.0f),
                    PathNode.LineTo(187.82f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(204.41827f, 128.0f, 208.0f, 131.58173f, 208.0f, 136.0f),
                    PathNode.CurveTo(208.0f, 140.41827f, 204.41827f, 144.0f, 200.0f, 144.0f),
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
        return _currencyKrw!!
    }

private var _currencyKrw: ImageVector? = null
