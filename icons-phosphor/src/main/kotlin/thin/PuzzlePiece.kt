package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorThinIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.14f, 161.93f),
                    PathNode.CurveTo(216.98009f, 161.19197f, 215.52242f, 161.10133f, 214.28f, 161.69f),
                    PathNode.CurveTo(206.59302f, 165.3342f, 197.55127f, 164.63681f, 190.51404f, 159.85692f),
                    PathNode.CurveTo(183.47682f, 155.07703f, 179.49577f, 146.92899f, 180.05f, 138.44f),
                    PathNode.CurveTo(180.56578f, 130.50461f, 184.97868f, 123.33993f, 191.83336f, 119.30882f),
                    PathNode.CurveTo(198.68803f, 115.277725f, 207.09438f, 114.903656f, 214.28f, 118.31f),
                    PathNode.CurveTo(215.51909f, 118.900154f, 216.97423f, 118.81384f, 218.13486f, 118.081345f),
                    PathNode.CurveTo(219.29549f, 117.34885f, 219.99954f, 116.07245f, 220.0f, 114.7f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(220.0f, 65.37258f, 214.62741f, 60.0f, 208.0f, 60.0f),
                    PathNode.LineTo(167.0f, 60.0f),
                    PathNode.CurveTo(170.00357f, 48.272785f, 166.13228f, 35.85455f, 156.99667f, 27.911638f),
                    PathNode.CurveTo(147.86107f, 19.968727f, 135.0253f, 17.861055f, 123.829384f, 22.465475f),
                    PathNode.CurveTo(112.63348f, 27.069899f, 104.99432f, 37.59808f, 104.09f, 49.67f),
                    PathNode.CurveTo(103.83971f, 53.139835f, 104.146935f, 56.62736f, 105.0f, 60.0f),
                    PathNode.LineTo(64.0f, 60.0f),
                    PathNode.CurveTo(57.37258f, 60.0f, 52.0f, 65.37258f, 52.0f, 72.0f),
                    PathNode.LineTo(52.0f, 109.0f),
                    PathNode.CurveTo(40.272785f, 105.99643f, 27.854551f, 109.86773f, 19.911638f, 119.00333f),
                    PathNode.CurveTo(11.968727f, 128.13893f, 9.861056f, 140.9747f, 14.465477f, 152.17061f),
                    PathNode.CurveTo(19.069899f, 163.36652f, 29.59808f, 171.00569f, 41.67f, 171.91f),
                    PathNode.CurveTo(45.139874f, 172.16534f, 48.62821f, 171.85805f, 52.0f, 171.0f),
                    PathNode.LineTo(52.0f, 208.0f),
                    PathNode.CurveTo(52.0f, 214.62741f, 57.37258f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 165.31f),
                    PathNode.CurveTo(220.0002f, 163.93903f, 219.29826f, 162.66347f, 218.14f, 161.93f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(61.79086f, 212.0f, 60.0f, 210.20914f, 60.0f, 208.0f),
                    PathNode.LineTo(60.0f, 165.31f),
                    PathNode.CurveTo(60.000202f, 163.93903f, 59.298267f, 162.66347f, 58.14f, 161.93f),
                    PathNode.CurveTo(56.982563f, 161.1956f, 55.529682f, 161.10504f, 54.29f, 161.69f),
                    PathNode.CurveTo(47.103443f, 165.10072f, 38.693832f, 164.72893f, 31.836298f, 160.69733f),
                    PathNode.CurveTo(24.978762f, 156.66573f, 20.564428f, 149.4982f, 20.05f, 141.56f),
                    PathNode.CurveTo(19.49385f, 133.06822f, 23.47613f, 124.91692f, 30.51642f, 120.13635f),
                    PathNode.CurveTo(37.556713f, 115.35578f, 46.60212f, 114.66089f, 54.29f, 118.31f),
                    PathNode.CurveTo(55.52818f, 118.89552f, 56.979855f, 118.80682f, 58.137535f, 118.07491f),
                    PathNode.CurveTo(59.295216f, 117.342995f, 59.997925f, 116.06964f, 60.0f, 114.7f),
                    PathNode.LineTo(60.0f, 72.0f),
                    PathNode.CurveTo(60.0f, 69.79086f, 61.79086f, 68.0f, 64.0f, 68.0f),
                    PathNode.LineTo(110.69f, 68.0f),
                    PathNode.CurveTo(112.06142f, 68.00135f, 113.33792f, 67.300026f, 114.072235f, 66.14176f),
                    PathNode.CurveTo(114.80655f, 64.98349f, 114.896286f, 63.529785f, 114.31f, 62.29f),
                    PathNode.CurveTo(110.89928f, 55.103443f, 111.271065f, 46.693832f, 115.30267f, 39.836296f),
                    PathNode.CurveTo(119.334274f, 32.978764f, 126.5018f, 28.564428f, 134.44f, 28.05f),
                    PathNode.CurveTo(142.93178f, 27.49385f, 151.08307f, 31.47613f, 155.86365f, 38.516422f),
                    PathNode.CurveTo(160.64423f, 45.556713f, 161.33911f, 54.60212f, 157.69f, 62.29f),
                    PathNode.CurveTo(157.10371f, 63.529785f, 157.19345f, 64.98349f, 157.92776f, 66.14176f),
                    PathNode.CurveTo(158.66208f, 67.300026f, 159.93858f, 68.00135f, 161.31f, 68.0f),
                    PathNode.LineTo(208.0f, 68.0f),
                    PathNode.CurveTo(210.20914f, 68.0f, 212.0f, 69.79086f, 212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 109.0f),
                    PathNode.CurveTo(208.62898f, 108.136856f, 205.14143f, 107.819496f, 201.67f, 108.06f),
                    PathNode.CurveTo(189.64468f, 109.025604f, 179.18446f, 116.67221f, 174.61526f, 127.83747f),
                    PathNode.CurveTo(170.04608f, 139.00273f, 172.14458f, 151.78879f, 180.04292f, 160.9078f),
                    PathNode.CurveTo(187.94127f, 170.02686f, 200.29689f, 173.9288f, 212.0f, 171.0f),
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
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
