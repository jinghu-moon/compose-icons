package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorDuotoneIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.LineTo(96.0f, 96.0f),
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
                    PathNode.MoveTo(245.66f, 42.34f),
                    PathNode.LineTo(213.66f, 10.34f),
                    PathNode.CurveTo(210.53407f, 7.214069f, 205.46593f, 7.214069f, 202.34f, 10.34f),
                    PathNode.CurveTo(199.21407f, 13.465932f, 199.21407f, 18.53407f, 202.34f, 21.66f),
                    PathNode.LineTo(203.82f, 23.13f),
                    PathNode.LineTo(148.65f, 64.51f),
                    PathNode.LineTo(110.43f, 72.16f),
                    PathNode.CurveTo(108.88244f, 72.47001f, 107.460144f, 73.228096f, 106.34f, 74.34f),
                    PathNode.LineTo(23.0f, 157.66f),
                    PathNode.CurveTo(13.628167f, 167.03246f, 13.628167f, 182.22754f, 23.0f, 191.6f),
                    PathNode.LineTo(64.4f, 233.0f),
                    PathNode.CurveTo(73.77245f, 242.37183f, 88.967545f, 242.37183f, 98.34f, 233.0f),
                    PathNode.LineTo(181.66f, 149.69f),
                    PathNode.CurveTo(182.7743f, 148.57166f, 183.53282f, 147.14857f, 183.84f, 145.6f),
                    PathNode.LineTo(191.49f, 107.38f),
                    PathNode.LineTo(232.87f, 52.21f),
                    PathNode.LineTo(234.34f, 53.69f),
                    PathNode.CurveTo(237.46593f, 56.815933f, 242.53407f, 56.815933f, 245.66f, 53.69f),
                    PathNode.CurveTo(248.78593f, 50.564068f, 248.78593f, 45.495934f, 245.66f, 42.37f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 204.69f),
                    PathNode.LineTo(51.31f, 152.0f),
                    PathNode.LineTo(96.0f, 107.31f),
                    PathNode.LineTo(148.69f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(81.37f, 224.0f),
                    PathNode.CurveTo(79.24978f, 224.00565f, 77.21537f, 223.16307f, 75.72f, 221.66f),
                    PathNode.LineTo(34.34f, 180.28f),
                    PathNode.CurveTo(31.218275f, 177.15623f, 31.218275f, 172.09377f, 34.34f, 168.97f),
                    PathNode.LineTo(40.0f, 163.31f),
                    PathNode.LineTo(92.69f, 216.0f),
                    PathNode.LineTo(87.0f, 221.66f),
                    PathNode.CurveTo(85.50578f, 223.15257f, 83.48197f, 223.99373f, 81.37f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.6f, 99.2f),
                    PathNode.CurveTo(176.88269f, 100.15437f, 176.39041f, 101.25856f, 176.16f, 102.43f),
                    PathNode.LineTo(168.63f, 140.06f),
                    PathNode.LineTo(160.0f, 148.69f),
                    PathNode.LineTo(107.31f, 96.0f),
                    PathNode.LineTo(115.94f, 87.37f),
                    PathNode.LineTo(153.57f, 79.84f),
                    PathNode.CurveTo(154.74144f, 79.60959f, 155.84563f, 79.11732f, 156.8f, 78.4f),
                    PathNode.LineTo(215.25f, 34.56f),
                    PathNode.LineTo(221.44f, 40.75f),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
