package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGooglePhotos: ImageVector
    get() {
        if (_brandGooglePhotos != null) return _brandGooglePhotos!!
        _brandGooglePhotos = tablerOutlineIcon(
            name = "BrandGooglePhotos",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.5 7C9.985 7 12 8.974 12 11.409v.591h-8.397c-.159 0-.312-.062-.426-.173C3.064 11.717 3 11.566 3 11.409 3 8.974 5.015 7 7.5 7")
            addPathData("M16.5 17C14.015 17 12 15.026 12 12.591v-.591h8.397c.333 0 .603 .265 .603 .591C21 15.026 18.985 17 16.5 17")
            addPathData("M7 16.5C7 14.015 8.972 12 11.405 12h.595v8.392c.001 .161-.061 .316-.173 .431-.111 .114-.263 .178-.422 .177C8.972 21 7 18.985 7 16.5")
            addPathData("M17 7.5C17 9.985 15.028 12 12.595 12h-.595v-8.397c-0-.16 .063-.314 .175-.428 .111-.113 .262-.176 .42-.175C15.028 3 17 5.015 17 7.5")
        }
        return _brandGooglePhotos!!
    }

private var _brandGooglePhotos: ImageVector? = null
