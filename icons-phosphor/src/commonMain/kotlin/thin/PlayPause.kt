package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorThinIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 64.0f),
                    PathNode.LineTo(180.0f, 192.0f),
                    PathNode.CurveTo(180.0f, 194.20914f, 178.20914f, 196.0f, 176.0f, 196.0f),
                    PathNode.CurveTo(173.79086f, 196.0f, 172.0f, 194.20914f, 172.0f, 192.0f),
                    PathNode.LineTo(172.0f, 64.0f),
                    PathNode.CurveTo(172.0f, 61.79086f, 173.79086f, 60.0f, 176.0f, 60.0f),
                    PathNode.CurveTo(178.20914f, 60.0f, 180.0f, 61.79086f, 180.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 60.0f),
                    PathNode.CurveTo(221.79086f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.LineTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 194.20914f, 221.79086f, 196.0f, 224.0f, 196.0f),
                    PathNode.CurveTo(226.20914f, 196.0f, 228.0f, 194.20914f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 61.79086f, 226.20914f, 60.0f, 224.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 128.0f),
                    PathNode.CurveTo(140.0197f, 132.05522f, 137.94867f, 135.83447f, 134.52f, 138.0f),
                    PathNode.LineTo(46.33f, 194.12f),
                    PathNode.CurveTo(42.642998f, 196.45522f, 37.978844f, 196.60457f, 34.15f, 194.51f),
                    PathNode.CurveTo(30.336487f, 192.46533f, 27.968876f, 188.47696f, 28.0f, 184.15f),
                    PathNode.LineTo(28.0f, 71.85f),
                    PathNode.CurveTo(27.968876f, 67.52304f, 30.336487f, 63.53467f, 34.15f, 61.49f),
                    PathNode.CurveTo(37.978844f, 59.39544f, 42.642998f, 59.544785f, 46.33f, 61.88f),
                    PathNode.LineTo(134.52f, 118.0f),
                    PathNode.CurveTo(137.94867f, 120.16552f, 140.0197f, 123.94478f, 140.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 128.0f),
                    PathNode.CurveTo(132.00624f, 126.690346f, 131.33235f, 125.47129f, 130.22f, 124.78f),
                    PathNode.LineTo(42.0f, 68.63f),
                    PathNode.CurveTo(41.37657f, 68.22735f, 40.652096f, 68.00898f, 39.91f, 68.0f),
                    PathNode.CurveTo(39.241554f, 68.004456f, 38.584885f, 68.17635f, 38.0f, 68.5f),
                    PathNode.CurveTo(36.760803f, 69.15635f, 35.98982f, 70.447754f, 36.0f, 71.85f),
                    PathNode.LineTo(36.0f, 184.15f),
                    PathNode.CurveTo(35.98982f, 185.55225f, 36.760803f, 186.84364f, 38.0f, 187.5f),
                    PathNode.CurveTo(39.256153f, 188.19403f, 40.791565f, 188.14413f, 42.0f, 187.37f),
                    PathNode.LineTo(130.18f, 131.22f),
                    PathNode.CurveTo(131.30768f, 130.53847f, 131.99773f, 129.31763f, 132.0f, 128.0f),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
