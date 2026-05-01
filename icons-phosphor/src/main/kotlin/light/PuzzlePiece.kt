package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) return _puzzlePiece!!
        _puzzlePiece = phosphorLightIcon(
            name = "PuzzlePiece",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(219.21f, 160.24f),
                    PathNode.CurveTo(217.47084f, 159.13983f, 215.2892f, 159.00772f, 213.43f, 159.89f),
                    PathNode.CurveTo(205.44852f, 163.66035f, 195.9863f, 162.29506f, 189.39624f, 156.42218f),
                    PathNode.CurveTo(182.80617f, 150.54929f, 180.36447f, 141.30617f, 183.19437f, 132.94485f),
                    PathNode.CurveTo(186.02426f, 124.58356f, 193.57774f, 118.72331f, 202.38f, 118.06f),
                    PathNode.CurveTo(206.17918f, 117.78511f, 209.98506f, 118.49463f, 213.43f, 120.12f),
                    PathNode.CurveTo(215.28853f, 121.00098f, 217.46878f, 120.8686f, 219.20708f, 119.76924f),
                    PathNode.CurveTo(220.94536f, 118.66988f, 221.9994f, 116.75675f, 222.0f, 114.7f),
                    PathNode.LineTo(222.0f, 72.0f),
                    PathNode.CurveTo(222.0f, 64.26801f, 215.73198f, 58.0f, 208.0f, 58.0f),
                    PathNode.LineTo(169.48f, 58.0f),
                    PathNode.CurveTo(169.82541f, 56.018654f, 169.99937f, 54.011227f, 170.0f, 52.0f),
                    PathNode.CurveTo(169.98553f, 42.615414f, 166.10411f, 33.651604f, 159.27f, 27.22f),
                    PathNode.CurveTo(152.44023f, 20.744059f, 143.20981f, 17.425465f, 133.82f, 18.07f),
                    PathNode.CurveTo(124.15473f, 18.692804f, 115.21381f, 23.408087f, 109.241066f, 31.032501f),
                    PathNode.CurveTo(103.268326f, 38.656918f, 100.83072f, 48.4667f, 102.54f, 58.0f),
                    PathNode.LineTo(64.0f, 58.0f),
                    PathNode.CurveTo(56.268013f, 58.0f, 50.0f, 64.26801f, 50.0f, 72.0f),
                    PathNode.LineTo(50.0f, 106.53f),
                    PathNode.CurveTo(38.671825f, 104.499825f, 27.085579f, 108.33807f, 19.21f, 116.73f),
                    PathNode.CurveTo(10.239058f, 126.28626f, 7.560113f, 140.14821f, 12.324386f, 152.35893f),
                    PathNode.CurveTo(17.08866f, 164.56966f, 28.447632f, 172.9544f, 41.52f, 173.91f),
                    PathNode.CurveTo(44.353985f, 174.11473f, 47.202423f, 173.96693f, 50.0f, 173.47f),
                    PathNode.LineTo(50.0f, 208.0f),
                    PathNode.CurveTo(50.0f, 215.73198f, 56.268013f, 222.0f, 64.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 165.31f),
                    PathNode.CurveTo(222.0003f, 163.25354f, 220.9474f, 161.34021f, 219.21f, 160.24f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(64.0f, 210.0f),
                    PathNode.CurveTo(62.89543f, 210.0f, 62.0f, 209.10457f, 62.0f, 208.0f),
                    PathNode.LineTo(62.0f, 165.31f),
                    PathNode.CurveTo(62.0f, 161.99629f, 59.31371f, 159.31f, 56.0f, 159.31f),
                    PathNode.CurveTo(55.11064f, 159.30783f, 54.232224f, 159.50607f, 53.43f, 159.89f),
                    PathNode.CurveTo(46.841785f, 163.01393f, 39.133797f, 162.67079f, 32.84925f, 158.97374f),
                    PathNode.CurveTo(26.564705f, 155.27672f, 22.520124f, 148.70616f, 22.05f, 141.43f),
                    PathNode.CurveTo(21.542427f, 133.64816f, 25.192408f, 126.17915f, 31.643797f, 121.79805f),
                    PathNode.CurveTo(38.095184f, 117.41694f, 46.383793f, 116.77853f, 53.43f, 120.12f),
                    PathNode.CurveTo(55.28853f, 121.00098f, 57.468784f, 120.8686f, 59.207073f, 119.76924f),
                    PathNode.CurveTo(60.945366f, 118.66988f, 61.99941f, 116.75675f, 62.0f, 114.7f),
                    PathNode.LineTo(62.0f, 72.0f),
                    PathNode.CurveTo(62.0f, 70.89543f, 62.89543f, 70.0f, 64.0f, 70.0f),
                    PathNode.LineTo(110.69f, 70.0f),
                    PathNode.CurveTo(112.74676f, 69.99941f, 114.65988f, 68.945366f, 115.75924f, 67.20708f),
                    PathNode.CurveTo(116.8586f, 65.46879f, 116.990974f, 63.28853f, 116.11f, 61.43f),
                    PathNode.CurveTo(114.51796f, 57.993324f, 113.82956f, 54.207127f, 114.11f, 50.43f),
                    PathNode.CurveTo(114.75014f, 41.61756f, 120.60033f, 34.0431f, 128.96495f, 31.19672f),
                    PathNode.CurveTo(137.32959f, 28.35034f, 146.58554f, 30.78437f, 152.46793f, 37.377277f),
                    PathNode.CurveTo(158.35031f, 43.97018f, 159.71768f, 53.44264f, 155.94f, 61.43f),
                    PathNode.CurveTo(155.06345f, 63.278927f, 155.18954f, 65.44709f, 156.27458f, 67.18191f),
                    PathNode.CurveTo(157.3596f, 68.91673f, 159.25392f, 69.979f, 161.3f, 70.0f),
                    PathNode.LineTo(208.0f, 70.0f),
                    PathNode.CurveTo(209.10457f, 70.0f, 210.0f, 70.89543f, 210.0f, 72.0f),
                    PathNode.LineTo(210.0f, 106.54f),
                    PathNode.CurveTo(200.4667f, 104.83072f, 190.65692f, 107.268326f, 183.0325f, 113.241066f),
                    PathNode.CurveTo(175.40808f, 119.21381f, 170.69281f, 128.15472f, 170.07f, 137.82f),
                    PathNode.CurveTo(169.43147f, 147.20712f, 172.74516f, 156.43394f, 179.21f, 163.27f),
                    PathNode.CurveTo(187.09877f, 171.64174f, 198.67213f, 175.47948f, 210.0f, 173.48f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
