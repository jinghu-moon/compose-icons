package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pipe: ImageVector
    get() {
        if (_pipe != null) return _pipe!!
        _pipe = phosphorRegularIcon(
            name = "Pipe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.LineTo(208.0f, 56.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(236.41827f, 56.0f, 240.0f, 52.418278f, 240.0f, 48.0f),
                    PathNode.CurveTo(240.0f, 43.581722f, 236.41827f, 40.0f, 232.0f, 40.0f),
                    PathNode.LineTo(205.83f, 40.0f),
                    PathNode.CurveTo(202.9766f, 35.057743f, 197.70682f, 32.009422f, 192.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(170.29318f, 32.009422f, 165.0234f, 35.057743f, 162.17f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.CurveTo(86.58752f, 40.060627f, 40.060627f, 86.58752f, 40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 162.16f),
                    PathNode.CurveTo(35.054657f, 165.0152f, 32.005856f, 170.28961f, 32.0f, 176.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.005856f, 197.71039f, 35.054657f, 202.9848f, 40.0f, 205.84f),
                    PathNode.LineTo(40.0f, 232.0f),
                    PathNode.CurveTo(40.0f, 236.41827f, 43.581722f, 240.0f, 48.0f, 240.0f),
                    PathNode.CurveTo(52.418278f, 240.0f, 56.0f, 236.41827f, 56.0f, 232.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.LineTo(104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 232.0f),
                    PathNode.CurveTo(104.0f, 236.41827f, 107.58172f, 240.0f, 112.0f, 240.0f),
                    PathNode.CurveTo(116.41828f, 240.0f, 120.0f, 236.41827f, 120.0f, 232.0f),
                    PathNode.LineTo(120.0f, 205.84f),
                    PathNode.CurveTo(124.94534f, 202.9848f, 127.99414f, 197.71039f, 128.0f, 192.0f),
                    PathNode.LineTo(128.0f, 176.0f),
                    PathNode.CurveTo(127.99414f, 170.28961f, 124.94534f, 165.0152f, 120.0f, 162.16f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 130.74516f, 130.74516f, 120.0f, 144.0f, 120.0f),
                    PathNode.LineTo(162.17f, 120.0f),
                    PathNode.CurveTo(165.0234f, 124.94225f, 170.29318f, 127.99058f, 176.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.CurveTo(197.70682f, 127.99058f, 202.9766f, 124.94225f, 205.83f, 120.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.CurveTo(236.41827f, 120.0f, 240.0f, 116.41828f, 240.0f, 112.0f),
                    PathNode.CurveTo(240.0f, 107.58172f, 236.41827f, 104.0f, 232.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 176.0f),
                    PathNode.LineTo(112.0f, 192.0f),
                    PathNode.LineTo(48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 144.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(56.055107f, 95.42178f, 95.42178f, 56.055107f, 144.0f, 56.0f),
                    PathNode.LineTo(160.0f, 56.0f),
                    PathNode.LineTo(160.0f, 104.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(121.90861f, 104.0f, 104.0f, 121.90861f, 104.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.LineTo(176.0f, 48.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.LineTo(192.0f, 111.8f),
                    PathNode.CurveTo(192.0f, 111.87f, 192.0f, 111.93f, 192.0f, 112.0f),
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
        return _pipe!!
    }

private var _pipe: ImageVector? = null
