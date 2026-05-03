package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorDuotoneIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(192.0f, 180.41827f, 188.41827f, 184.0f, 184.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(67.58172f, 184.0f, 64.0f, 180.41827f, 64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 44.653774f, 92.65378f, 16.0f, 128.0f, 16.0f),
                    PathNode.LineTo(128.0f, 16.0f),
                    PathNode.CurveTo(163.34622f, 16.0f, 192.0f, 44.653774f, 192.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 8.0f),
                    PathNode.CurveTo(88.25378f, 8.04409f, 56.04409f, 40.253773f, 56.0f, 80.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 184.83656f, 63.163445f, 192.0f, 72.0f, 192.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.LineTo(104.0f, 232.0f),
                    PathNode.CurveTo(104.0f, 245.25484f, 114.74516f, 256.0f, 128.0f, 256.0f),
                    PathNode.CurveTo(141.25484f, 256.0f, 152.0f, 245.25484f, 152.0f, 232.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.LineTo(184.0f, 192.0f),
                    PathNode.CurveTo(192.83656f, 192.0f, 200.0f, 184.83656f, 200.0f, 176.0f),
                    PathNode.LineTo(200.0f, 80.0f),
                    PathNode.CurveTo(199.95592f, 40.253773f, 167.74623f, 8.04409f, 128.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 236.41827f, 132.41827f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(123.58172f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 176.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.LineTo(72.0f, 80.0f),
                    PathNode.CurveTo(72.0f, 49.072056f, 97.07206f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(158.92795f, 24.0f, 184.0f, 49.072056f, 184.0f, 80.0f),
                    PathNode.LineTo(184.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.CurveTo(120.0f, 156.41827f, 116.41828f, 160.0f, 112.0f, 160.0f),
                    PathNode.CurveTo(107.58172f, 160.0f, 104.0f, 156.41827f, 104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.CurveTo(104.0f, 67.58172f, 107.58172f, 64.0f, 112.0f, 64.0f),
                    PathNode.CurveTo(116.41828f, 64.0f, 120.0f, 67.58172f, 120.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 72.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 156.41827f, 148.41827f, 160.0f, 144.0f, 160.0f),
                    PathNode.CurveTo(139.58173f, 160.0f, 136.0f, 156.41827f, 136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 67.58172f, 139.58173f, 64.0f, 144.0f, 64.0f),
                    PathNode.CurveTo(148.41827f, 64.0f, 152.0f, 67.58172f, 152.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
