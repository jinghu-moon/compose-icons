package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorDuotoneIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 111.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 204.41827f, 204.41827f, 208.0f, 200.0f, 208.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.CurveTo(148.41827f, 208.0f, 152.0f, 204.41827f, 152.0f, 200.0f),
                    PathNode.LineTo(152.0f, 111.0f),
                    PathNode.CurveTo(167.63423f, 106.99713f, 177.84106f, 91.97878f, 175.80807f, 75.96882f),
                    PathNode.CurveTo(173.77505f, 59.95885f, 160.13852f, 47.968235f, 144.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.CurveTo(216.13852f, 47.968235f, 229.77505f, 59.95885f, 231.80807f, 75.96882f),
                    PathNode.CurveTo(233.84106f, 91.97878f, 223.63423f, 106.99713f, 208.0f, 111.0f),
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
                    PathNode.MoveTo(240.0f, 80.0f),
                    PathNode.CurveTo(240.0f, 57.90861f, 222.09138f, 40.0f, 200.0f, 40.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(29.067947f, 40.011482f, 12.73675f, 53.293922f, 8.868236f, 71.82652f),
                    PathNode.CurveTo(4.999721f, 90.35912f, 14.653501f, 109.0657f, 32.0f, 116.65f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 208.83656f, 39.163445f, 216.0f, 48.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(208.83656f, 216.0f, 216.0f, 208.83656f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 116.65f),
                    PathNode.CurveTo(230.56305f, 110.27717f, 239.98021f, 95.896385f, 240.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 120.0f),
                    PathNode.CurveTo(52.418278f, 120.0f, 56.0f, 116.41828f, 56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 107.58172f, 52.418278f, 104.0f, 48.0f, 104.0f),
                    PathNode.CurveTo(34.745167f, 104.0f, 24.0f, 93.25484f, 24.0f, 80.0f),
                    PathNode.CurveTo(24.0f, 66.74516f, 34.745167f, 56.0f, 48.0f, 56.0f),
                    PathNode.LineTo(144.0f, 56.0f),
                    PathNode.CurveTo(157.25484f, 56.0f, 168.0f, 66.74516f, 168.0f, 80.0f),
                    PathNode.CurveTo(168.0f, 93.25484f, 157.25484f, 104.0f, 144.0f, 104.0f),
                    PathNode.CurveTo(139.58173f, 104.0f, 136.0f, 107.58172f, 136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 116.41828f, 139.58173f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 104.0f),
                    PathNode.CurveTo(195.58173f, 104.0f, 192.0f, 107.58172f, 192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 116.41828f, 195.58173f, 120.0f, 200.0f, 120.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.LineTo(160.0f, 200.0f),
                    PathNode.LineTo(160.0f, 116.65f),
                    PathNode.CurveTo(171.20204f, 111.75885f, 179.55284f, 102.01423f, 182.67079f, 90.19528f),
                    PathNode.CurveTo(185.78873f, 78.376335f, 183.33154f, 65.78047f, 176.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.CurveTo(213.25484f, 56.0f, 224.0f, 66.74516f, 224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 93.25484f, 213.25484f, 104.0f, 200.0f, 104.0f),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
