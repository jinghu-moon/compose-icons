package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorDuotoneIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 77.09f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(216.0f, 192.0f, 128.0f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(128.0f, 208.0f, 40.0f, 192.0f, 40.0f, 136.0f),
                    PathNode.LineTo(40.0f, 77.09f),
                    PathNode.CurveTo(39.99991f, 73.72433f, 42.10636f, 70.71854f, 45.27f, 69.57f),
                    PathNode.LineTo(125.27f, 40.48f),
                    PathNode.CurveTo(127.03368f, 39.839706f, 128.96631f, 39.839706f, 130.73f, 40.48f),
                    PathNode.LineTo(210.73f, 69.57f),
                    PathNode.CurveTo(213.89363f, 70.71854f, 216.00009f, 73.72433f, 216.0f, 77.09f),
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
                    PathNode.MoveTo(176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 108.41828f, 172.41827f, 112.0f, 168.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.CurveTo(83.58172f, 112.0f, 80.0f, 108.41828f, 80.0f, 104.0f),
                    PathNode.CurveTo(80.0f, 99.58172f, 83.58172f, 96.0f, 88.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(172.41827f, 96.0f, 176.0f, 99.58172f, 176.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 128.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.CurveTo(83.58172f, 128.0f, 80.0f, 131.58173f, 80.0f, 136.0f),
                    PathNode.CurveTo(80.0f, 140.41827f, 83.58172f, 144.0f, 88.0f, 144.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(172.41827f, 144.0f, 176.0f, 140.41827f, 176.0f, 136.0f),
                    PathNode.CurveTo(176.0f, 131.58173f, 172.41827f, 128.0f, 168.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 104.0f),
                    PathNode.LineTo(256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 145.67311f, 241.67311f, 160.0f, 224.0f, 160.0f),
                    PathNode.LineTo(218.81f, 160.0f),
                    PathNode.CurveTo(211.62f, 175.8f, 197.02f, 189.43f, 175.58f, 200.16f),
                    PathNode.CurveTo(160.93019f, 207.34482f, 145.42076f, 212.6244f, 129.43f, 215.87f),
                    PathNode.CurveTo(128.48454f, 216.04333f, 127.51546f, 216.04333f, 126.57f, 215.87f),
                    PathNode.CurveTo(110.57923f, 212.6244f, 95.06981f, 207.34482f, 80.42f, 200.16f),
                    PathNode.CurveTo(59.0f, 189.43f, 44.38f, 175.8f, 37.19f, 160.0f),
                    PathNode.LineTo(32.0f, 160.0f),
                    PathNode.CurveTo(14.326888f, 160.0f, 0f, 145.67311f, 0f, 128.0f),
                    PathNode.LineTo(0f, 104.0f),
                    PathNode.CurveTo(0f, 86.32689f, 14.326888f, 72.0f, 32.0f, 72.0f),
                    PathNode.LineTo(32.85f, 72.0f),
                    PathNode.CurveTo(34.381985f, 67.36437f, 37.946636f, 63.681885f, 42.53f, 62.0f),
                    PathNode.LineTo(122.53f, 32.91f),
                    PathNode.CurveTo(126.064285f, 31.629677f, 129.93571f, 31.629677f, 133.47f, 32.91f),
                    PathNode.LineTo(213.47f, 62.0f),
                    PathNode.CurveTo(218.05336f, 63.681885f, 221.61801f, 67.36437f, 223.15f, 72.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(241.67311f, 72.0f, 256.0f, 86.32689f, 256.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.55f, 144.0f),
                    PathNode.CurveTo(32.184647f, 141.34897f, 32.00089f, 138.67609f, 32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.CurveTo(23.163445f, 88.0f, 16.0f, 95.163445f, 16.0f, 104.0f),
                    PathNode.LineTo(16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 136.83656f, 23.163445f, 144.0f, 32.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 136.0f),
                    PathNode.LineTo(208.0f, 77.09f),
                    PathNode.LineTo(128.0f, 48.0f),
                    PathNode.LineTo(48.0f, 77.09f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.CurveTo(48.0f, 181.0f, 117.09f, 197.52f, 128.0f, 199.84f),
                    PathNode.CurveTo(138.89f, 197.52f, 208.0f, 181.0f, 208.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 104.0f),
                    PathNode.CurveTo(240.0f, 95.163445f, 232.83656f, 88.0f, 224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.CurveTo(223.99911f, 138.67609f, 223.81535f, 141.34897f, 223.45f, 144.0f),
                    PathNode.LineTo(224.0f, 144.0f),
                    PathNode.CurveTo(232.83656f, 144.0f, 240.0f, 136.83656f, 240.0f, 128.0f),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
