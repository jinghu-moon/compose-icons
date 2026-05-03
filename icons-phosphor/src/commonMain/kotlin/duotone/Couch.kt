package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorDuotoneIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 172.41827f, 236.41827f, 176.0f, 232.0f, 176.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(19.581722f, 176.0f, 16.0f, 172.41827f, 16.0f, 168.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(16.0f, 115.58172f, 19.581722f, 112.0f, 24.0f, 112.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(24.0f, 67.58172f, 27.581722f, 64.0f, 32.0f, 64.0f),
                    PathNode.LineTo(224.0f, 64.0f),
                    PathNode.CurveTo(228.41827f, 64.0f, 232.0f, 67.58172f, 232.0f, 72.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(236.41827f, 112.0f, 240.0f, 115.58172f, 240.0f, 120.0f),
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
                    PathNode.MoveTo(240.0f, 106.17f),
                    PathNode.LineTo(240.0f, 72.0f),
                    PathNode.CurveTo(240.0f, 63.163445f, 232.83656f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(23.163445f, 56.0f, 16.0f, 63.163445f, 16.0f, 72.0f),
                    PathNode.LineTo(16.0f, 106.17f),
                    PathNode.CurveTo(11.057744f, 109.0234f, 8.009424f, 114.29319f, 8.0f, 120.0f),
                    PathNode.LineTo(8.0f, 168.0f),
                    PathNode.CurveTo(8.0f, 176.83656f, 15.163444f, 184.0f, 24.0f, 184.0f),
                    PathNode.LineTo(32.0f, 184.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 204.41827f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.CurveTo(44.418278f, 208.0f, 48.0f, 204.41827f, 48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 204.41827f, 211.58173f, 208.0f, 216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 204.41827f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.LineTo(232.0f, 184.0f),
                    PathNode.CurveTo(240.83656f, 184.0f, 248.0f, 176.83656f, 248.0f, 168.0f),
                    PathNode.LineTo(248.0f, 120.0f),
                    PathNode.CurveTo(247.99057f, 114.29319f, 244.94226f, 109.0234f, 240.0f, 106.17f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
                    PathNode.CurveTo(207.16344f, 104.0f, 200.0f, 111.163445f, 200.0f, 120.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.LineTo(56.0f, 120.0f),
                    PathNode.CurveTo(56.0f, 111.163445f, 48.836555f, 104.0f, 40.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 168.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.LineTo(24.0f, 120.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.LineTo(40.0f, 144.0f),
                    PathNode.CurveTo(40.0f, 148.41827f, 43.581722f, 152.0f, 48.0f, 152.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(212.41827f, 152.0f, 216.0f, 148.41827f, 216.0f, 144.0f),
                    PathNode.LineTo(216.0f, 120.0f),
                    PathNode.LineTo(232.0f, 120.0f),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
