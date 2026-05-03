package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorDuotoneIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.CurveTo(51.581722f, 48.0f, 48.0f, 51.581722f, 48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 204.41827f, 51.581722f, 208.0f, 56.0f, 208.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.CurveTo(204.41827f, 208.0f, 208.0f, 204.41827f, 208.0f, 200.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.CurveTo(208.0f, 51.581722f, 204.41827f, 48.0f, 200.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 152.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
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
                    PathNode.MoveTo(152.0f, 96.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(99.58172f, 96.0f, 96.0f, 99.58172f, 96.0f, 104.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 156.41827f, 99.58172f, 160.0f, 104.0f, 160.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.CurveTo(156.41827f, 160.0f, 160.0f, 156.41827f, 160.0f, 152.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 99.58172f, 156.41827f, 96.0f, 152.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(236.41827f, 112.0f, 240.0f, 108.41828f, 240.0f, 104.0f),
                    PathNode.CurveTo(240.0f, 99.58172f, 236.41827f, 96.0f, 232.0f, 96.0f),
                    PathNode.LineTo(216.0f, 96.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.CurveTo(216.0f, 47.163445f, 208.83656f, 40.0f, 200.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.LineTo(160.0f, 24.0f),
                    PathNode.CurveTo(160.0f, 19.581722f, 156.41827f, 16.0f, 152.0f, 16.0f),
                    PathNode.CurveTo(147.58173f, 16.0f, 144.0f, 19.581722f, 144.0f, 24.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.LineTo(112.0f, 24.0f),
                    PathNode.CurveTo(112.0f, 19.581722f, 108.41828f, 16.0f, 104.0f, 16.0f),
                    PathNode.CurveTo(99.58172f, 16.0f, 96.0f, 19.581722f, 96.0f, 24.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(47.163445f, 40.0f, 40.0f, 47.163445f, 40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.LineTo(24.0f, 96.0f),
                    PathNode.CurveTo(19.581722f, 96.0f, 16.0f, 99.58172f, 16.0f, 104.0f),
                    PathNode.CurveTo(16.0f, 108.41828f, 19.581722f, 112.0f, 24.0f, 112.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.LineTo(24.0f, 144.0f),
                    PathNode.CurveTo(19.581722f, 144.0f, 16.0f, 147.58173f, 16.0f, 152.0f),
                    PathNode.CurveTo(16.0f, 156.41827f, 19.581722f, 160.0f, 24.0f, 160.0f),
                    PathNode.LineTo(40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 208.83656f, 47.163445f, 216.0f, 56.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(96.0f, 236.41827f, 99.58172f, 240.0f, 104.0f, 240.0f),
                    PathNode.CurveTo(108.41828f, 240.0f, 112.0f, 236.41827f, 112.0f, 232.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.LineTo(144.0f, 216.0f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.CurveTo(144.0f, 236.41827f, 147.58173f, 240.0f, 152.0f, 240.0f),
                    PathNode.CurveTo(156.41827f, 240.0f, 160.0f, 236.41827f, 160.0f, 232.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(208.83656f, 216.0f, 216.0f, 208.83656f, 216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.LineTo(232.0f, 160.0f),
                    PathNode.CurveTo(236.41827f, 160.0f, 240.0f, 156.41827f, 240.0f, 152.0f),
                    PathNode.CurveTo(240.0f, 147.58173f, 236.41827f, 144.0f, 232.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 151.87f),
                    PathNode.CurveTo(200.0f, 151.87f, 200.0f, 151.96f, 200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 152.04f, 200.0f, 152.09f, 200.0f, 152.13f),
                    PathNode.LineTo(200.0f, 200.0f),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null
