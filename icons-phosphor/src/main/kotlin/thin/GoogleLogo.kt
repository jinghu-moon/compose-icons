package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GoogleLogo: ImageVector
    get() {
        if (_googleLogo != null) return _googleLogo!!
        _googleLogo = phosphorThinIcon(
            name = "GoogleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 128.0f),
                    PathNode.CurveTo(219.97882f, 172.72025f, 187.80241f, 210.94783f, 143.74167f, 218.59969f),
                    PathNode.CurveTo(99.68091f, 226.25154f, 56.499626f, 201.11102f, 41.40166f, 159.01646f),
                    PathNode.CurveTo(26.3037f, 116.921906f, 43.66274f, 70.06752f, 82.542725f, 47.971207f),
                    PathNode.CurveTo(121.42271f, 25.87489f, 170.56064f, 34.93764f, 199.0f, 69.45f),
                    PathNode.CurveTo(200.40833f, 71.1538f, 200.1688f, 73.676674f, 198.465f, 75.085f),
                    PathNode.CurveTo(196.7612f, 76.493324f, 194.23833f, 76.2538f, 192.83f, 74.55f),
                    PathNode.CurveTo(167.10156f, 43.33069f, 122.77518f, 34.884968f, 87.3694f, 54.45609f),
                    PathNode.CurveTo(51.963627f, 74.027214f, 35.537285f, 116.055f, 48.288136f, 154.44788f),
                    PathNode.CurveTo(61.038982f, 192.84076f, 99.34449f, 216.69128f, 139.42393f, 211.19264f),
                    PathNode.CurveTo(179.50339f, 205.694f, 209.9702f, 172.40836f, 211.91f, 132.0f),
                    PathNode.LineTo(128.0f, 132.0f),
                    PathNode.CurveTo(125.79086f, 132.0f, 124.0f, 130.20914f, 124.0f, 128.0f),
                    PathNode.CurveTo(124.0f, 125.79086f, 125.79086f, 124.0f, 128.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(218.20914f, 124.0f, 220.0f, 125.79086f, 220.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googleLogo!!
    }

private var _googleLogo: ImageVector? = null
