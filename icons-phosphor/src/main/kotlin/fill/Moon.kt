package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Moon: ImageVector
    get() {
        if (_moon != null) return _moon!!
        _moon = phosphorFillIcon(
            name = "Moon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.54f, 150.21f),
                    PathNode.CurveTo(229.07956f, 171.29973f, 216.13206f, 189.81462f, 198.54f, 203.12f),
                    PathNode.CurveTo(167.03719f, 226.83011f, 124.83536f, 230.68658f, 89.55685f, 213.07912f),
                    PathNode.CurveTo(54.278336f, 195.47163f, 31.990452f, 159.42838f, 32.0f, 120.0f),
                    PathNode.CurveTo(31.930496f, 97.43654f, 39.265594f, 75.4734f, 52.88f, 57.48f),
                    PathNode.CurveTo(66.18537f, 39.88793f, 84.70028f, 26.940449f, 105.79f, 20.48f),
                    PathNode.CurveTo(108.62262f, 19.60779f, 111.70534f, 20.373129f, 113.8011f, 22.468897f),
                    PathNode.CurveTo(115.89687f, 24.564667f, 116.66221f, 27.647379f, 115.79f, 30.48f),
                    PathNode.CurveTo(106.39381f, 61.560883f, 114.85963f, 95.290665f, 137.81949f, 118.25052f),
                    PathNode.CurveTo(160.77933f, 141.21037f, 194.50912f, 149.6762f, 225.59f, 140.28f),
                    PathNode.CurveTo(228.42262f, 139.40779f, 231.50534f, 140.17313f, 233.6011f, 142.26889f),
                    PathNode.CurveTo(235.69687f, 144.36467f, 236.4622f, 147.44737f, 235.59f, 150.28f),
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
        return _moon!!
    }

private var _moon: ImageVector? = null
