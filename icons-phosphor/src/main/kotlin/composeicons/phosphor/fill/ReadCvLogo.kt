package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ReadCvLogo: ImageVector
    get() {
        if (_readCvLogo != null) return _readCvLogo!!
        _readCvLogo = phosphorFillIcon(
            name = "ReadCvLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.78 39.25 80.53 16.25C71.829 14.719 63.534 20.53 62 29.23L32.25 198.23c-.735 4.181 .222 8.483 2.66 11.959 2.438 3.475 6.158 5.839 10.34 6.571l130.25 23c4.183 .738 8.487-.218 11.965-2.656 3.478-2.439 5.843-6.16 6.575-10.344L223.79 57.76c1.518-8.704-4.307-16.99-13.01-18.51ZM135.5 131.56c-.674 3.82-3.991 6.606-7.87 6.61-.469-0-.938-.04-1.4-.12L84.73 130.72c-4.093-1.007-6.703-5.016-5.966-9.166 .737-4.15 4.567-7.017 8.756-6.554L129 122.29c2.092 .366 3.953 1.549 5.172 3.287 1.219 1.739 1.697 3.891 1.328 5.983ZM182.5 107.38c-.673 3.816-3.985 6.601-7.86 6.61-.473 .001-.945-.043-1.41-.13L90.23 99.21c-4.352-.77-7.255-4.923-6.485-9.275 .77-4.352 4.923-7.255 9.275-6.485l83 14.66c2.094 .364 3.957 1.545 5.178 3.284 1.221 1.739 1.701 3.893 1.332 5.986ZM188.05 75.86c-.674 3.82-3.991 6.606-7.87 6.61-.469-.001-.938-.041-1.4-.12l-83-14.66c-2.882-.424-5.305-2.381-6.327-5.108-1.022-2.728-.48-5.795 1.413-8.008 1.894-2.213 4.841-3.222 7.693-2.634l83 14.65c2.096 .361 3.961 1.542 5.185 3.281 1.223 1.739 1.704 3.894 1.335 5.989Z"),
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
        return _readCvLogo!!
    }

private var _readCvLogo: ImageVector? = null
