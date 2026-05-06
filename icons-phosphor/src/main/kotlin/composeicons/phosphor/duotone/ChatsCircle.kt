package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChatsCircle: ImageVector
    get() {
        if (_chatsCircle != null) return _chatsCircle!!
        _chatsCircle = phosphorDuotoneIcon(
            name = "ChatsCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.66 213.73c.825 2.808 .05 5.842-2.019 7.911-2.069 2.069-5.103 2.844-7.911 2.019L194 215.5c-18.537 9.914-40.479 11.237-60.073 3.623C114.332 211.51 99.04 195.719 92.06 175.89h0c1.31 .07 2.62 .11 3.94 .11 23.352 .002 45.255-11.322 58.755-30.377 13.5-19.055 16.92-43.473 9.175-65.503h0c24.581 1.335 46.776 15.135 58.846 36.59 12.071 21.454 12.344 47.589 .724 69.29Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232.07 186.76c11.215-23.262 10.512-50.506-1.888-73.158C217.781 90.95 195.209 75.677 169.57 72.59 158.125 45.979 133.188 27.634 104.376 24.63 75.564 21.625 47.38 34.431 30.69 58.108 14.001 81.785 11.415 112.635 23.93 138.76l-7.27 24.71c-1.656 5.619-.108 11.694 4.034 15.836 4.142 4.142 10.217 5.69 15.836 4.034l24.71-7.27c7.934 3.812 16.441 6.295 25.18 7.35 8.58 20.103 25.011 35.82 45.475 43.498 20.464 7.678 43.179 6.649 62.865-2.848l24.71 7.27c5.617 1.654 11.689 .107 15.83-4.032 4.141-4.139 5.691-10.21 4.04-15.828ZM62 159.5c-.764 .002-1.525 .11-2.26 .32L32 168l8.17-27.76c.581-2.006 .355-4.159-.63-6C24.582 106.267 32.372 71.558 57.849 52.659c25.477-18.898 60.953-16.283 83.384 6.147 22.43 22.43 25.046 57.906 6.147 83.384-18.898 25.477-53.607 33.267-81.581 18.309-1.164-.644-2.47-.988-3.8-1ZM215.79 188.23 224 216l-27.76-8.17c-2.006-.581-4.159-.355-6 .63-30.635 16.358-68.725 5.322-85.87-24.88 22.144-2.311 42.321-13.754 55.67-31.572 13.35-17.818 18.663-40.397 14.66-62.298 19.343 4.56 35.471 17.846 43.648 35.959 8.177 18.113 7.476 38.997-1.898 56.521-.996 1.852-1.222 4.022-.63 6.04Z"),
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
