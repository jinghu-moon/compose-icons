package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorFillIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 184.0f),
                    PathNode.LineTo(172.61f, 184.0f),
                    PathNode.CurveTo(156.9285f, 183.97905f, 142.69885f, 174.81691f, 136.19f, 160.55f),
                    PathNode.LineTo(113.19f, 110.07f),
                    PathNode.CurveTo(109.303215f, 101.5177f, 100.784065f, 96.01933f, 91.39f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.CurveTo(66.74516f, 96.0f, 56.0f, 106.74516f, 56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 157.25484f, 66.74516f, 168.0f, 80.0f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.CurveTo(95.29194f, 168.01324f, 102.19169f, 164.6996f, 106.74f, 159.0f),
                    PathNode.CurveTo(108.49248f, 156.66722f, 111.375984f, 155.47351f, 114.264534f, 155.88503f),
                    PathNode.CurveTo(117.15308f, 156.29655f, 119.58852f, 158.24802f, 120.619804f, 160.9774f),
                    PathNode.CurveTo(121.65109f, 163.70677f, 121.11467f, 166.78116f, 119.22f, 169.0f),
                    PathNode.CurveTo(111.64583f, 178.5f, 100.14978f, 184.0234f, 88.0f, 184.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(57.90861f, 184.0f, 40.0f, 166.09138f, 40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(40.0f, 97.90861f, 57.90861f, 80.0f, 80.0f, 80.0f),
                    PathNode.LineTo(91.39f, 80.0f),
                    PathNode.CurveTo(107.071495f, 80.02094f, 121.30115f, 89.18309f, 127.81f, 103.45f),
                    PathNode.LineTo(150.76f, 153.93f),
                    PathNode.CurveTo(154.65428f, 162.49875f, 163.19783f, 168.00024f, 172.61f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(192.83656f, 168.0f, 200.0f, 160.83656f, 200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 143.16344f, 192.83656f, 136.0f, 184.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.CurveTo(160.53603f, 136.0f, 148.0f, 123.463974f, 148.0f, 108.0f),
                    PathNode.CurveTo(148.0f, 92.536026f, 160.53603f, 80.0f, 176.0f, 80.0f),
                    PathNode.LineTo(188.0f, 80.0f),
                    PathNode.CurveTo(199.0457f, 80.0f, 208.0f, 88.95431f, 208.0f, 100.0f),
                    PathNode.CurveTo(208.0f, 104.41828f, 204.41827f, 108.0f, 200.0f, 108.0f),
                    PathNode.CurveTo(195.58173f, 108.0f, 192.0f, 104.41828f, 192.0f, 100.0f),
                    PathNode.CurveTo(192.0f, 97.79086f, 190.20914f, 96.0f, 188.0f, 96.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.CurveTo(169.37259f, 96.0f, 164.0f, 101.37258f, 164.0f, 108.0f),
                    PathNode.CurveTo(164.0f, 114.62742f, 169.37259f, 120.0f, 176.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.CurveTo(201.67311f, 120.0f, 216.0f, 134.32689f, 216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 169.67311f, 201.67311f, 184.0f, 184.0f, 184.0f),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
