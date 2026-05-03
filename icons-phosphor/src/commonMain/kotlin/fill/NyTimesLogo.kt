package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorFillIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 136.0f),
                    PathNode.CurveTo(178.62741f, 136.0f, 184.0f, 141.37259f, 184.0f, 148.0f),
                    PathNode.CurveTo(184.0f, 154.62741f, 178.62741f, 160.0f, 172.0f, 160.0f),
                    PathNode.CurveTo(165.37259f, 160.0f, 160.0f, 154.62741f, 160.0f, 148.0f),
                    PathNode.CurveTo(160.0f, 141.37259f, 165.37259f, 136.0f, 172.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.62f, 103.25f),
                    PathNode.LineTo(118.91f, 72.59f),
                    PathNode.CurveTo(83.96532f, 77.02084f, 57.366417f, 106.09976f, 56.06f, 141.3f),
                    PathNode.LineTo(124.24f, 104.94f),
                    PathNode.CurveTo(126.71934f, 103.61982f, 129.70941f, 103.69664f, 132.11768f, 105.14242f),
                    PathNode.CurveTo(134.52594f, 106.588196f, 135.99953f, 109.191086f, 136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 215.55f),
                    PathNode.CurveTo(164.39407f, 212.47469f, 188.24901f, 192.82806f, 196.71f, 165.55f),
                    PathNode.CurveTo(198.04929f, 161.32779f, 202.55779f, 158.9907f, 206.78f, 160.33f),
                    PathNode.CurveTo(211.00221f, 161.6693f, 213.3393f, 166.17778f, 212.0f, 170.4f),
                    PathNode.CurveTo(201.8273f, 202.51172f, 174.2165f, 225.99908f, 140.88911f, 230.89108f),
                    PathNode.CurveTo(107.56174f, 235.78308f, 74.365845f, 221.2213f, 55.39399f, 193.3876f),
                    PathNode.CurveTo(36.42213f, 165.55391f, 35.00337f, 129.33237f, 51.74f, 100.1f),
                    PathNode.CurveTo(36.895653f, 92.56366f, 29.154903f, 75.832085f, 33.021175f, 59.6394f),
                    PathNode.CurveTo(36.887447f, 43.446712f, 51.352154f, 32.017063f, 68.0f, 32.0f),
                    PathNode.CurveTo(69.16773f, 32.00189f, 70.32107f, 32.25781f, 71.38f, 32.75f),
                    PathNode.LineTo(189.63f, 87.93f),
                    PathNode.CurveTo(200.30489f, 87.0348f, 208.37894f, 77.88765f, 207.94202f, 67.18421f),
                    PathNode.CurveTo(207.50508f, 56.480766f, 198.71234f, 48.022144f, 188.0f, 48.0f),
                    PathNode.CurveTo(183.58173f, 48.0f, 180.0f, 44.418278f, 180.0f, 40.0f),
                    PathNode.CurveTo(180.0f, 35.581722f, 183.58173f, 32.0f, 188.0f, 32.0f),
                    PathNode.CurveTo(207.88223f, 32.0f, 224.0f, 48.11775f, 224.0f, 68.0f),
                    PathNode.CurveTo(224.0f, 87.88225f, 207.88223f, 104.0f, 188.0f, 104.0f),
                    PathNode.CurveTo(186.83228f, 103.9981f, 185.67894f, 103.742195f, 184.62f, 103.25f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 208.47f),
                    PathNode.LineTo(96.0f, 138.13f),
                    PathNode.LineTo(57.51f, 158.66f),
                    PathNode.CurveTo(62.04979f, 180.27481f, 76.229355f, 198.62462f, 96.0f, 208.47f),
                    PathNode.Close,
                    PathNode.MoveTo(96.13f, 62.0f),
                    PathNode.LineTo(66.37f, 48.07f),
                    PathNode.CurveTo(57.02023f, 48.85681f, 49.474373f, 56.03754f, 48.225178f, 65.33683f),
                    PathNode.CurveTo(46.975983f, 74.63612f, 52.359325f, 83.55366f, 61.17f, 86.78f),
                    PathNode.CurveTo(61.77f, 86.07f, 62.37f, 85.36f, 63.01f, 84.67f),
                    PathNode.CurveTo(72.156364f, 74.66301f, 83.491135f, 66.90458f, 96.13f, 62.0f),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
