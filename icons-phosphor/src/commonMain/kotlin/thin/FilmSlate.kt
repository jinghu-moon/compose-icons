package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorThinIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 108.0f),
                    PathNode.LineTo(71.26f, 108.0f),
                    PathNode.LineTo(209.0f, 71.64f),
                    PathNode.CurveTo(210.03156f, 71.368195f, 210.91179f, 70.69561f, 211.4451f, 69.77172f),
                    PathNode.CurveTo(211.9784f, 68.84784f, 212.12056f, 67.7492f, 211.84f, 66.72f),
                    PathNode.LineTo(203.68f, 36.72f),
                    PathNode.CurveTo(201.92326f, 30.438404f, 195.44397f, 26.735313f, 189.14f, 28.41f),
                    PathNode.LineTo(36.83f, 68.61f),
                    PathNode.CurveTo(33.765263f, 69.402954f, 31.148651f, 71.39605f, 29.57f, 74.14f),
                    PathNode.CurveTo(28.014639f, 76.81957f, 27.596886f, 80.01034f, 28.41f, 83.0f),
                    PathNode.LineTo(36.08f, 111.19f),
                    PathNode.CurveTo(36.024937f, 111.45644f, 35.99812f, 111.727936f, 36.0f, 112.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 206.62741f, 41.37258f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(208.0f, 212.0f),
                    PathNode.CurveTo(214.62741f, 212.0f, 220.0f, 206.62741f, 220.0f, 200.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(220.0f, 109.79086f, 218.20914f, 108.0f, 216.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(126.0f, 53.33f),
                    PathNode.LineTo(164.0f, 75.25f),
                    PathNode.LineTo(116.08f, 87.9f),
                    PathNode.LineTo(78.12f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(191.16f, 36.13f),
                    PathNode.CurveTo(191.48651f, 36.044655f, 191.82251f, 36.000973f, 192.16f, 36.0f),
                    PathNode.CurveTo(193.93153f, 35.949753f, 195.51198f, 37.10627f, 196.0f, 38.81f),
                    PathNode.LineTo(203.1f, 64.93f),
                    PathNode.LineTo(175.0f, 72.35f),
                    PathNode.LineTo(137.0f, 50.43f),
                    PathNode.Close,
                    PathNode.MoveTo(36.46f, 78.13f),
                    PathNode.CurveTo(36.977646f, 77.237335f, 37.83116f, 76.589096f, 38.83f, 76.33f),
                    PathNode.LineTo(67.1f, 68.87f),
                    PathNode.LineTo(105.1f, 90.78f),
                    PathNode.LineTo(43.25f, 107.12f),
                    PathNode.LineTo(36.13f, 80.94f),
                    PathNode.CurveTo(35.873745f, 79.99475f, 36.007015f, 78.98624f, 36.5f, 78.14f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 200.0f),
                    PathNode.CurveTo(212.0f, 202.20914f, 210.20914f, 204.0f, 208.0f, 204.0f),
                    PathNode.LineTo(48.0f, 204.0f),
                    PathNode.CurveTo(45.79086f, 204.0f, 44.0f, 202.20914f, 44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 116.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
