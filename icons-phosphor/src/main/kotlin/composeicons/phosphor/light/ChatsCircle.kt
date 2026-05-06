package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorLightIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.93 186.58c11.319-22.881 10.726-49.853-1.589-72.214C216.026 92.005 193.548 77.085 168.16 74.42 157.342 48.032 132.985 29.652 104.641 26.488 76.298 23.325 48.488 35.883 32.118 59.236 15.748 82.589 13.429 113.015 26.07 138.58L18.58 164c-1.472 4.929-.122 10.267 3.515 13.905 3.637 3.637 8.976 4.987 13.905 3.515l25.46-7.49c8.276 4.085 17.211 6.668 26.39 7.63 8.199 20.033 24.355 35.759 44.602 43.414 20.247 7.656 42.765 6.553 62.168-3.044L220 229.42c4.929 1.472 10.267 .122 13.905-3.515 3.637-3.637 4.987-8.976 3.515-13.905ZM62 161.5c-.572-0-1.141 .081-1.69 .24l-27.77 8.17c-.701 .204-1.458 .011-1.974-.506-.516-.516-.71-1.273-.506-1.974l8.17-27.77c.439-1.514 .271-3.139-.47-4.53C22.335 106.283 30.368 70.489 56.641 51c26.273-19.489 62.858-16.792 85.99 6.339 23.131 23.131 25.828 59.716 6.339 85.99-19.489 26.273-55.283 34.307-84.13 18.881-.874-.468-1.849-.711-2.84-.71ZM217.71 187.66l8.17 27.77c.204 .701 .011 1.458-.506 1.974-.516 .516-1.273 .71-1.974 .506l-27.77-8.17c-1.514-.438-3.139-.27-4.53 .47-15.663 8.372-34.038 10.079-50.975 4.735-16.937-5.344-31.005-17.289-39.025-33.135 22.705-1.477 43.629-12.805 57.279-31.008 13.65-18.203 18.663-41.463 13.721-63.672 20.676 3.866 38.272 17.356 47.373 36.32 9.101 18.964 8.617 41.131-1.303 59.68-.727 1.396-.882 3.022-.43 4.53Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chatsCircle!!
    }

private var _chatsCircle: ImageVector? = null
