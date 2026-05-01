package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileImage: ImageVector
    get() {
        if (_fileImage != null) return _fileImage!!
        _fileImage = phosphorLightIcon(
            name = "FileImage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(109.0f, 148.67f),
                    PathNode.CurveTo(107.88835f, 146.99413f, 106.01105f, 145.98662f, 104.0f, 145.98662f),
                    PathNode.CurveTo(101.98895f, 145.98662f, 100.11165f, 146.99413f, 99.0f, 148.67f),
                    PathNode.LineTo(76.46f, 182.5f),
                    PathNode.LineTo(65.05f, 164.76f),
                    PathNode.CurveTo(63.94651f, 163.04005f, 62.043507f, 161.99998f, 60.0f, 161.99998f),
                    PathNode.CurveTo(57.956493f, 161.99998f, 56.05349f, 163.04005f, 54.95f, 164.76f),
                    PathNode.LineTo(18.95f, 220.76f),
                    PathNode.CurveTo(17.765306f, 222.6065f, 17.682867f, 224.9524f, 18.735014f, 226.8775f),
                    PathNode.CurveTo(19.78716f, 228.80263f, 21.806124f, 230.0f, 24.0f, 230.0f),
                    PathNode.LineTo(152.0f, 230.0f),
                    PathNode.CurveTo(154.21475f, 230.00328f, 156.25122f, 228.78622f, 157.29736f, 226.83412f),
                    PathNode.CurveTo(158.3435f, 224.88202f, 158.22919f, 222.51236f, 157.0f, 220.67f),
                    PathNode.Close,
                    PathNode.MoveTo(35.0f, 218.0f),
                    PathNode.LineTo(60.0f, 179.1f),
                    PathNode.LineTo(71.32f, 196.7f),
                    PathNode.CurveTo(72.41818f, 198.38484f, 74.287445f, 199.40744f, 76.29853f, 199.42352f),
                    PathNode.CurveTo(78.309616f, 199.43962f, 80.19501f, 198.44707f, 81.32f, 196.78f),
                    PathNode.LineTo(103.96f, 162.78f),
                    PathNode.LineTo(140.79f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.24f, 83.76f),
                    PathNode.LineTo(156.24f, 27.76f),
                    PathNode.CurveTo(155.11586f, 26.63446f, 153.59076f, 26.0014f, 152.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(48.268013f, 26.0f, 42.0f, 32.268013f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 131.3137f, 44.68629f, 134.0f, 48.0f, 134.0f),
                    PathNode.CurveTo(51.31371f, 134.0f, 54.0f, 131.3137f, 54.0f, 128.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.LineTo(146.0f, 38.0f),
                    PathNode.LineTo(146.0f, 88.0f),
                    PathNode.CurveTo(146.0f, 91.313705f, 148.6863f, 94.0f, 152.0f, 94.0f),
                    PathNode.LineTo(202.0f, 94.0f),
                    PathNode.LineTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(192.0f, 218.0f),
                    PathNode.CurveTo(188.6863f, 218.0f, 186.0f, 220.6863f, 186.0f, 224.0f),
                    PathNode.CurveTo(186.0f, 227.3137f, 188.6863f, 230.0f, 192.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(213.9986f, 86.40924f, 213.36554f, 84.88415f, 212.24f, 83.76f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 46.48f),
                    PathNode.LineTo(193.52f, 82.0f),
                    PathNode.LineTo(158.0f, 82.0f),
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
        return _fileImage!!
    }

private var _fileImage: ImageVector? = null
