package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Drone: ImageVector
    get() {
        if (_drone != null) return _drone!!
        _drone = phosphorRegularIcon(
            name = "Drone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(189.66f, 66.34f),
                    PathNode.CurveTo(188.15945f, 64.83778f, 186.12328f, 63.993706f, 184.0f, 63.993706f),
                    PathNode.CurveTo(181.87672f, 63.993706f, 179.84055f, 64.83778f, 178.34f, 66.34f),
                    PathNode.LineTo(148.69f, 96.0f),
                    PathNode.LineTo(107.31f, 96.0f),
                    PathNode.LineTo(77.66f, 66.34f),
                    PathNode.CurveTo(74.534065f, 63.21407f, 69.465935f, 63.21407f, 66.34f, 66.34f),
                    PathNode.CurveTo(63.21407f, 69.465935f, 63.21407f, 74.534065f, 66.34f, 77.66f),
                    PathNode.LineTo(96.0f, 107.31f),
                    PathNode.LineTo(96.0f, 148.69f),
                    PathNode.LineTo(66.34f, 178.34f),
                    PathNode.CurveTo(63.21407f, 181.46593f, 63.21407f, 186.53407f, 66.34f, 189.66f),
                    PathNode.CurveTo(69.465935f, 192.78593f, 74.534065f, 192.78593f, 77.66f, 189.66f),
                    PathNode.LineTo(107.31f, 160.0f),
                    PathNode.LineTo(148.69f, 160.0f),
                    PathNode.LineTo(178.34f, 189.66f),
                    PathNode.CurveTo(181.46593f, 192.78593f, 186.53407f, 192.78593f, 189.66f, 189.66f),
                    PathNode.CurveTo(192.78593f, 186.53407f, 192.78593f, 181.46593f, 189.66f, 178.34f),
                    PathNode.LineTo(160.0f, 148.69f),
                    PathNode.LineTo(160.0f, 107.31f),
                    PathNode.LineTo(189.66f, 77.66f),
                    PathNode.CurveTo(191.16223f, 76.159454f, 192.00629f, 74.123276f, 192.00629f, 72.0f),
                    PathNode.CurveTo(192.00629f, 69.876724f, 191.16223f, 67.840546f, 189.66f, 66.34f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 112.0f),
                    PathNode.LineTo(144.0f, 112.0f),
                    PathNode.LineTo(144.0f, 144.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.51f, 61.33f),
                    PathNode.CurveTo(145.34663f, 42.015415f, 164.60994f, 29.97588f, 184.96718f, 32.29434f),
                    PathNode.CurveTo(205.32443f, 34.612797f, 221.3872f, 50.67557f, 223.70566f, 71.032814f),
                    PathNode.CurveTo(226.02412f, 91.39006f, 213.98459f, 110.65337f, 194.67f, 117.49f),
                    PathNode.CurveTo(193.81636f, 117.813774f, 192.91289f, 117.98636f, 192.0f, 118.0f),
                    PathNode.CurveTo(188.1058f, 117.99822f, 184.7786f, 115.192635f, 184.11917f, 111.35467f),
                    PathNode.CurveTo(183.45976f, 107.5167f, 185.65971f, 103.76147f, 189.33f, 102.46f),
                    PathNode.CurveTo(201.61993f, 98.10835f, 209.28008f, 85.85017f, 207.8043f, 72.89635f),
                    PathNode.CurveTo(206.32857f, 59.942528f, 196.10747f, 49.721447f, 183.15367f, 48.24569f),
                    PathNode.CurveTo(170.19983f, 46.769928f, 157.94165f, 54.430065f, 153.59f, 66.72f),
                    PathNode.CurveTo(152.67256f, 69.462006f, 150.34694f, 71.495575f, 147.50706f, 72.03905f),
                    PathNode.CurveTo(144.66719f, 72.58252f, 141.75505f, 71.55129f, 139.89005f, 69.341774f),
                    PathNode.CurveTo(138.02504f, 67.13225f, 137.49742f, 64.08831f, 138.51f, 61.38f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 180.0f),
                    PathNode.CurveTo(224.01045f, 201.43729f, 208.57005f, 219.762f, 187.44159f, 223.38762f),
                    PathNode.CurveTo(166.31313f, 227.01324f, 145.64693f, 214.88438f, 138.51f, 194.67f),
                    PathNode.CurveTo(137.12537f, 190.53166f, 139.31267f, 186.04713f, 143.42621f, 184.59048f),
                    PathNode.CurveTo(147.53975f, 183.13383f, 152.06177f, 185.24251f, 153.59f, 189.33f),
                    PathNode.CurveTo(157.94165f, 201.61993f, 170.19983f, 209.28008f, 183.15367f, 207.8043f),
                    PathNode.CurveTo(196.10747f, 206.32857f, 206.32857f, 196.10747f, 207.8043f, 183.15367f),
                    PathNode.CurveTo(209.28008f, 170.19983f, 201.61993f, 157.94165f, 189.33f, 153.59f),
                    PathNode.CurveTo(185.24251f, 152.06177f, 183.13383f, 147.53975f, 184.59048f, 143.42621f),
                    PathNode.CurveTo(186.04713f, 139.31267f, 190.53166f, 137.12537f, 194.67f, 138.51f),
                    PathNode.CurveTo(212.23769f, 144.7449f, 223.98228f, 161.35872f, 224.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.49f, 194.67f),
                    PathNode.CurveTo(110.65337f, 213.98459f, 91.39006f, 226.02412f, 71.032814f, 223.70566f),
                    PathNode.CurveTo(50.67557f, 221.3872f, 34.612797f, 205.32443f, 32.29434f, 184.96718f),
                    PathNode.CurveTo(29.97588f, 164.60994f, 42.015415f, 145.34663f, 61.33f, 138.51f),
                    PathNode.CurveTo(65.468346f, 137.12537f, 69.952866f, 139.31267f, 71.409515f, 143.42621f),
                    PathNode.CurveTo(72.86617f, 147.53975f, 70.7575f, 152.06177f, 66.67f, 153.59f),
                    PathNode.CurveTo(54.380062f, 157.94165f, 46.71993f, 170.19983f, 48.19569f, 183.15367f),
                    PathNode.CurveTo(49.671448f, 196.10747f, 59.89253f, 206.32857f, 72.846344f, 207.8043f),
                    PathNode.CurveTo(85.80016f, 209.28008f, 98.05836f, 201.61993f, 102.41f, 189.33f),
                    PathNode.CurveTo(103.93823f, 185.24251f, 108.46025f, 183.13383f, 112.57379f, 184.59048f),
                    PathNode.CurveTo(116.68734f, 186.04713f, 118.874626f, 190.53166f, 117.49f, 194.67f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 76.0f),
                    PathNode.CurveTo(31.98954f, 54.562717f, 47.42994f, 36.238007f, 68.5584f, 32.612385f),
                    PathNode.CurveTo(89.686874f, 28.98676f, 110.35307f, 41.115612f, 117.49f, 61.33f),
                    PathNode.CurveTo(118.50259f, 64.03831f, 117.97497f, 67.082245f, 116.109955f, 69.29177f),
                    PathNode.CurveTo(114.24494f, 71.5013f, 111.33281f, 72.53252f, 108.492935f, 71.989044f),
                    PathNode.CurveTo(105.65305f, 71.44558f, 103.32743f, 69.412f, 102.41f, 66.67f),
                    PathNode.CurveTo(98.05836f, 54.380062f, 85.80016f, 46.71993f, 72.846344f, 48.19569f),
                    PathNode.CurveTo(59.89253f, 49.671448f, 49.671448f, 59.89253f, 48.19569f, 72.846344f),
                    PathNode.CurveTo(46.71993f, 85.80016f, 54.380062f, 98.05836f, 66.67f, 102.41f),
                    PathNode.CurveTo(70.42046f, 103.65709f, 72.69815f, 107.45612f, 72.03097f, 111.351776f),
                    PathNode.CurveTo(71.363785f, 115.24743f, 67.95171f, 118.072014f, 64.0f, 118.0f),
                    PathNode.CurveTo(63.090084f, 118.00237f, 62.186665f, 117.846725f, 61.33f, 117.54f),
                    PathNode.CurveTo(43.745033f, 111.29895f, 31.996561f, 94.65963f, 32.0f, 76.0f),
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
        return _drone!!
    }

private var _drone: ImageVector? = null
