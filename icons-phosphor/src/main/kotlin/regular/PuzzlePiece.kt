package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorRegularIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.27f, 158.54f),
                    PathNode.CurveTo(217.95163f, 157.07767f, 215.04599f, 156.90408f, 212.57f, 158.08f),
                    PathNode.CurveTo(204.16644f, 162.05434f, 194.1324f, 159.71454f, 188.35352f, 152.43307f),
                    PathNode.CurveTo(182.57463f, 145.15161f, 182.57463f, 134.84839f, 188.35352f, 127.56692f),
                    PathNode.CurveTo(194.1324f, 120.28545f, 204.16644f, 117.94567f, 212.57f, 121.92f),
                    PathNode.CurveTo(215.04887f, 123.096436f, 217.95772f, 122.92038f, 220.27661f, 121.453575f),
                    PathNode.CurveTo(222.59552f, 119.98676f, 224.0009f, 117.43387f, 224.0f, 114.69f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(224.0f, 63.163445f, 216.83656f, 56.0f, 208.0f, 56.0f),
                    PathNode.LineTo(171.78f, 56.0f),
                    PathNode.CurveTo(171.92886f, 54.671898f, 172.00232f, 53.33642f, 172.0f, 52.0f),
                    PathNode.CurveTo(171.98515f, 42.06284f, 167.87587f, 32.570984f, 160.64f, 25.76f),
                    PathNode.CurveTo(150.52226f, 16.257475f, 135.84276f, 13.418188f, 122.91138f, 18.462599f),
                    PathNode.CurveTo(109.98f, 23.50701f, 101.100624f, 35.536404f, 100.09f, 49.38f),
                    PathNode.CurveTo(99.93633f, 51.586357f, 99.98319f, 53.80211f, 100.23f, 56.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(55.163445f, 56.0f, 48.0f, 63.163445f, 48.0f, 72.0f),
                    PathNode.LineTo(48.0f, 104.22f),
                    PathNode.CurveTo(46.671898f, 104.07114f, 45.33642f, 103.99769f, 44.0f, 104.0f),
                    PathNode.CurveTo(34.063084f, 104.01603f, 24.57168f, 108.125114f, 17.76f, 115.36f),
                    PathNode.CurveTo(10.897124f, 122.60938f, 7.383001f, 132.40106f, 8.07f, 142.36f),
                    PathNode.CurveTo(9.25526f, 160.293f, 23.45795f, 174.61934f, 41.38f, 175.96f),
                    PathNode.CurveTo(43.586235f, 176.11864f, 45.802444f, 176.07176f, 48.0f, 175.82f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 216.83656f, 55.163445f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 165.31f),
                    PathNode.CurveTo(224.00166f, 162.56255f, 222.59335f, 160.00645f, 220.27f, 158.54f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.LineTo(64.0f, 165.31f),
                    PathNode.CurveTo(64.0009f, 162.56613f, 62.595516f, 160.01323f, 60.276615f, 158.54643f),
                    PathNode.CurveTo(57.957718f, 157.07962f, 55.048874f, 156.90356f, 52.57f, 158.08f),
                    PathNode.CurveTo(44.166435f, 162.05434f, 34.132393f, 159.71454f, 28.353512f, 152.43307f),
                    PathNode.CurveTo(22.57463f, 145.15161f, 22.57463f, 134.84839f, 28.353512f, 127.56692f),
                    PathNode.CurveTo(34.132393f, 120.28545f, 44.166435f, 117.94567f, 52.57f, 121.92f),
                    PathNode.CurveTo(55.048874f, 123.096436f, 57.957718f, 122.92038f, 60.276615f, 121.453575f),
                    PathNode.CurveTo(62.595516f, 119.98676f, 64.0009f, 117.43387f, 64.0f, 114.69f),
                    PathNode.LineTo(64.0f, 72.0f),
                    PathNode.LineTo(110.69f, 72.0f),
                    PathNode.CurveTo(113.43387f, 72.0009f, 115.98676f, 70.59551f, 117.453575f, 68.27662f),
                    PathNode.CurveTo(118.92038f, 65.95772f, 119.096436f, 63.048874f, 117.92f, 60.57f),
                    PathNode.CurveTo(113.94567f, 52.166435f, 116.28545f, 42.132393f, 123.56692f, 36.35351f),
                    PathNode.CurveTo(130.84839f, 30.57463f, 141.15161f, 30.57463f, 148.43307f, 36.35351f),
                    PathNode.CurveTo(155.71454f, 42.132393f, 158.05434f, 52.166435f, 154.08f, 60.57f),
                    PathNode.CurveTo(152.90356f, 63.048874f, 153.07962f, 65.95772f, 154.54643f, 68.27662f),
                    PathNode.CurveTo(156.01323f, 70.59551f, 158.56613f, 72.0009f, 161.31f, 72.0f),
                    PathNode.LineTo(208.0f, 72.0f),
                    PathNode.LineTo(208.0f, 104.23f),
                    PathNode.CurveTo(205.80244f, 103.97823f, 203.58624f, 103.931366f, 201.38f, 104.09f),
                    PathNode.CurveTo(182.02638f, 105.46045f, 167.24026f, 121.92164f, 167.9467f, 141.31085f),
                    PathNode.CurveTo(168.65314f, 160.70007f, 184.59796f, 176.0416f, 204.0f, 176.0f),
                    PathNode.CurveTo(205.33643f, 176.00232f, 206.67189f, 175.92886f, 208.0f, 175.78f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
